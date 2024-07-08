package org.example;

import java.util.Objects;

public class Orders {
    private int orderid ;
    private String ordername;
    private double price;
    private String address;

    public Orders(int orderid, String ordername, double price, String address) {
        this.orderid = orderid;
        this.ordername = ordername;
        this.price = price;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;
        Orders orders = (Orders) o;
        return orderid == orders.orderid && ordername.equals(orders.ordername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderid, ordername);
    }
}




