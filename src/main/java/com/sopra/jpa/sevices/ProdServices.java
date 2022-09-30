package com.sopra.jpa.sevices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.jpa.entity.Product;
import com.sopra.jpa.repository.prodRepository;


@Service
public class ProdServices  { 
@Autowired	
private prodRepository serviceRepo;
public List<Product> getAllProducts(){
	List<Product> list=new ArrayList<Product>();
	this.serviceRepo.findAll().forEach(list::add);
	return list;
}
public Product addProduct(Product product) {
	return this.serviceRepo.save(product);
	
}
public Product updateProduct(Integer id,Product product) {
	return this.serviceRepo.save(product);
	
}
public void deleteProduct(Integer id) {
	this.serviceRepo.deleteById(id);
	
}
}
