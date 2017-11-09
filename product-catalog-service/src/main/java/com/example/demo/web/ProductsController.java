package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	public List<Product> list() {
		return productRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Product list(@PathVariable int id) {
		return productRepository.findOne(id);
	}
	
	

}
