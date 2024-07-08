package org.example;

import java.util.Map;

public class EmployeeMain {
        public static void main(String[] args) {
            Map<Employee, String> data = Employee.loademployees();
            System.out.println(data);
            String organisation = data.get(new Employee(3, "Sonu", "Hyderabad" , 11));
            System.out.println("Sonu is woking in : " + organisation);
        }
}

