package org.example;

import java.util.HashMap;

public class OrderRepo {
    private HashMap orders;
    private String order;
//----------constructor-----------
    public OrderRepo(HashMap orders,String order) {
        this.orders = orders;
        this.order=order;
    }
}
