package com.example.springmvc;

import com.example.springmvc.dao.entities.Product;
import com.example.springmvc.service.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {

	@Autowired
	private ProductManager productManager;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product(null, "msi", 1223.0);
		Product product1 = new Product(null, "dell", 1235.0);
		Product product2 = new Product(null, "hp", 1823.0);
		productManager.addProduct(product);
		productManager.addProduct(product1);
		productManager.addProduct(product2);

		System.out.println(productManager.getAllProducts());

	}
}
