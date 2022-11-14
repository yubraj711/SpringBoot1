package com.javageek.crud;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javageek.crud.Model.Product;
import com.javageek.crud.repository.ProductRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class SpringBootCrud3ApplicationTests {

//	@Test
//	void contextLoads() {
//	}
//
//}

	@Autowired
	public ProductRepository repo;

	@Test
	@Order(1)

	public void addProductTest() {
		Product product = new Product();

		product.setId(10);
		product.setName("PowerBank");
		product.setPrice(120000);
		product.setQuantity(4);
		repo.save(product);
		 assertNotNull(repo.findById(10).get());

	}

	private void assertNotNull(Product product) {
		// TODO Auto-generated method stub

	}

	@Test
	@Order(2)
	public void getProductTest() {

		Product product = repo.findById(10).get();

		assertEquals(120000, product.getPrice());

	}

	private void assertEquals(int i, double price) {
		// TODO Auto-generated method stub

	}

	@Test
	@Order(3)
	public void getProductsTest() {
		List<Product> pro = repo.findAll();

		assertThat(pro).size().isGreaterThan(0);

	}

	@Test
	@Order(4)

	public void updateTest() {

		Product product = repo.findById(10).get();
		product.setPrice(123800);
		product.setQuantity(9);
		assertNotEquals(120000, repo.findById(10).get().getPrice());
	}

	private void assertNotEquals(int i, double price) {
		// TODO Auto-generated method stub

	}

	@Test
	@Order(5)

	public void deleteTest() {

		repo.deleteById(10);

		assertThat(repo.existsById(10)).isFalse();
	}

}
