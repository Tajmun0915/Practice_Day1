package org.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ConcurrentHashMapPractice {
    private static Map<Student, AtomicLong> student = new ConcurrentHashMap<>();

//    private static ExecutorService service = Executors.newFixedThreadPool(4);



    public static void main(String[] args) throws InterruptedException {
        student.put(new Student(1, "Tajmun", "CSE"), new AtomicLong());
        student.put(new Student(2, "Sonu", "Mech"), new AtomicLong());
        student.put(new Student(3, "Monu", "Bcom"), new AtomicLong());
        student.put(new Student(4, "Zufi", "IT"), new AtomicLong());

        for (int i =0 ; i < 10; i++) {
            ExecutorService service = Executors.newFixedThreadPool(4);

            service.submit(ConcurrentHashMapPractice::processOrders);
            service.submit(ConcurrentHashMapPractice::processOrders);
            service.submit(ConcurrentHashMapPractice::processOrders);
            service.awaitTermination(3, TimeUnit.SECONDS);
            service.shutdown();
            System.out.println(student);
        }
    }

    private static void processOrders() {
        for (Student stu: student.keySet() ) {
            for (int i=0; i<50; i++) {
                AtomicLong oldStu = student.get(stu);
                oldStu.getAndIncrement();
                student.put(stu, oldStu);
            }
        }
    }
}