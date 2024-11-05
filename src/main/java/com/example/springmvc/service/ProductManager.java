package com.example.springmvc.service;

import com.example.springmvc.dao.entities.Product;

import java.util.List;

public interface ProductManager {
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public boolean deleteProduct(Product product);
    public List<Product> getAllProducts();
}
