package com.javatpoint;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService   {
	List<Product> list;
	
	public ProductService() {
		list = new ArrayList<>();
		list.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));
		list.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));
		list.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));
		list.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));
		list.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));
		list.add(new Product(105, "Refrigerator ", "12WP9087", 10000.00, 4));
//returns a list of product
		
	}
	

	
	public Product getProduct(long productId) {
		Product c = null;
		for (Product product : list) {
			if (product.getId() == productId) {
				c = product;
				break;
			}
		}
		return c;
	}
	
	
	public Product addProduct(Product product) {
		list.add(product);
		return product;
	}

	public Product getProductById(long productId) {
		Product p = null;
		for (Product product : list) {
			if (product.getId() == productId) {
				p = product;
				break;
			}
		}
		return p;

	}

	public void updateProduct(Product product, long id) {
		// TODO Auto-generated method stub

		/*
		 * for(Product pro:list) { if(pro.getId()==product.getId()) {
		 * pro.setId(product.getId()); pro.setPname(product.getPname());
		 * pro.setBatchno(product.getBatchno()); pro.setPrice(product.getPrice());
		 * pro.setNoofproduct(product.getNoofproduct()); list.add(pro); break; } }
		 * return product;
		 */
		// Product p = null;
		for (Product pro : list) {
			if (pro.getId() == id) {
//				p = pro;
//				break;
//			}

				pro.setPname(product.getPname());
				pro.setBatchno(product.getBatchno());
				pro.setPrice(product.getPrice());
				pro.setNoofproduct(product.getNoofproduct());
				//list.add(pro);
				break;
			}

		}
	}

	public void deleteProduct(long productId) {
		// TODO Auto-generated method stub
		// Product p = null;
		for (Product product : list) {
			if (product.getId() == productId) {
				list.remove(product);
				break;
			}
		}

	}



	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return list;
	}


	
}
