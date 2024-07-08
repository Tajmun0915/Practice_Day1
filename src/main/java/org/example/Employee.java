package org.example;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Employee  {
    private int id;
    private String name;
    private String address;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public Employee(int id, String name, String address , int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee emp = (Employee) o;
        return id == emp.id && Objects.equals(name, emp.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public static Map<Employee, String> loademployees() {
        Map<Employee, String> emps = new TreeMap<>((o1, o2) -> {
            if (o1.getId() == o2.getId())
                return o1.getName().compareTo(o2.getName());
            return o1.getId() > o2.getId() ? 1 : -1;
        });
        emps.put(new Employee(1, "ziya", "Tenali" , 23), "Nisum");
        emps.put(new Employee(2, "Zufi", "Guntur" ,22), "Infosys");
        emps.put(new Employee(3, "Sonu", "Hyderabad" , 11), "TCS");
        emps.put(new Employee(4, "Monu", "Manali" , 21), "Accenture");
        emps.put(new Employee(5, "Shannu", "Guntur" ,20), "Delloite");
        emps.put(new Employee(6, "Summy", "Tenali" , 17), "TCS");
        return emps;
    }
}
