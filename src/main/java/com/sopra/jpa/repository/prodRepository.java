package com.sopra.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sopra.jpa.entity.Product;
@Repository
public interface prodRepository extends CrudRepository<Product, Integer> {

}
