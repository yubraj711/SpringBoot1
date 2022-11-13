package com.javageek.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javageek.crud.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);
	
	
	

}
