package com.sopra.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.jpa.entity.Product;
import com.sopra.jpa.sevices.ProdServices;

@RestController
public class ProdController {
	@Autowired
 private ProdServices service;	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAllProducts();	
	}
	@PostMapping("/products/addproducts")
	public Product addProduct(@RequestBody Product product) {
		return this.service.addProduct(product);
	}
	@PutMapping("/upproducts/{prodid}")
	public Product updateProduct(@PathVariable int prodid,@RequestBody Product product) {
		
		return this.service.updateProduct(prodid, product);
	}
	@DeleteMapping("/delproducts/{prodid}")
	public void deleteproduct(@PathVariable int prodid) {
		this.service.deleteProduct(prodid);
	}
	

}
