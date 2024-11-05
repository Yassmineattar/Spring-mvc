package com.example.springmvc.dao.repositories;


import com.example.springmvc.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
