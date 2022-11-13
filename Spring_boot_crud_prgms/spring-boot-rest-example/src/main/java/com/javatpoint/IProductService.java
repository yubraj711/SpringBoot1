package com.javatpoint;

import java.util.List;

public interface IProductService {
	List<Product> findAll();

	public Product getProductById(long productId);

	public Product addProduct(Product product);

	public void updateProduct(Product product,long id);

	public void deleteProduct(long productId);
}
