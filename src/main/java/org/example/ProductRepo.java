package org.example;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ProductRepo {
    private ArrayList<Product> products = new ArrayList<Product>();
    public Product addProduct(Product product){
        products.add(product);
        return product;
    }
//_____________________constructor--------------------
    public ProductRepo(ArrayList<Product> products) {
        this.products = products;
    }
    public ProductRepo(){} //empty constructor
    //-------------------setter &  getter-------------------


    public ArrayList<Product> getAllProducts() {   //getAllProducts
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
    public  Product getProduct(String id){
        for (Product product : products){
            if(product.getId().equals(id)){
                System.out.println(product);
                return product;}}
        throw new NoSuchElementException("Product with ID"+ id + "not found ");}}











