package org.example;

import java.util.ArrayList;

public class ShopService {
    private final  ProductRepo productRepo;
    public ShopService(){
        productRepo = new ProductRepo();}
    public Product addProduct(Product product){
        return productRepo.addProduct(product);}
    public  Product getProduct(String id ){
        return productRepo.getProduct(id);
    }
    public ArrayList<Product> getAllProducts(){
        return productRepo.getAllProducts();
    }
}
