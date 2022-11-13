package com.javageek.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javageek.crud.Model.Product;
import com.javageek.crud.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	// inject repository into prod.service
	// POST-SAVE

	private ProductRepository repository;

	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {

		return repository.saveAll(products);

	}

	// Get-fetch

	public List<Product> getProducts() {
		return repository.findAll();

	}

	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);

	}

	public Product getProductByName(String name) {
		return repository.findByName(name);

	}

	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "product is removed" + id;
	}

	public Product updateProduct(Product product) {
	    Product existingProduct = repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
		
	}

}
