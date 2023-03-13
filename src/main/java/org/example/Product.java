package org.example;

import java.util.ArrayList;

public class Product extends ProductRepo{

    private String id;
    private String name;
    ArrayList<Product> products = getAllProducts();
    //-----------------------------constructor--------------
    public Product(){}
    public Product(String id, String name){
        this.id=id;
        this.name= name;}

    public String getId() {
        return id;}

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", products=" + products +
                "} " + super.toString();
    }
}
