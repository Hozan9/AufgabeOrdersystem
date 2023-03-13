package org.example;

public class Order {
    private String orderId;
    private String products;
    //----------constructor_-----------
    public Order(){}
    public Order(String orderId,String Products){
        this.orderId = orderId;
        this.products = Products;}
//------- setter & getter_------------
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", products='" + products + '\'' +
                '}';
    }
}
