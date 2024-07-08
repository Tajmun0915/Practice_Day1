package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Orders, String> ordersMap = allOrders();
        System.out.println(ordersMap.get(new Orders(105, "Earrings", 509.90, "Tenali")));
    }

    public static Map<Orders, String> allOrders() {
        Map<Orders, String> orders = new HashMap<>();
        orders.put(new Orders(100, "shoes", 1000.00, "Guntur"), "Status : Shipped");
        orders.put(new Orders(101, "Watch", 500.90, "Tenali"), "Status : Out For Delivery");
        orders.put(new Orders(102, "T-Shirt", 300.99, "Hyderabad"), "Status : Delivered");
        orders.put(new Orders(103, "Mobile", 35000.50, "Banglore"), "Status : Order Recieved");
        orders.put(new Orders(104, "Cup", 180.70, "Chennai"), "Status : Ordered");
        orders.put(new Orders(105, "Earrings", 509.90, "Tenali"), "Status : Shipped");

        return orders;
    }
}