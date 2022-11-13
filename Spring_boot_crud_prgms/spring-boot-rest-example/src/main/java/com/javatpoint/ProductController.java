//package com.javatpoint;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//public class ProductController 
//{
//@Autowired
//private Ilistervice listervice;
////mapping the getProduct() method to /product
//@GetMapping(value = "/product")
//public List<Product> getProduct() 
//{
////finds all the list
//List<Product> list = listervice.findAll();
////returns the product list
//return list;
//}
//}

package com.javatpoint;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController
public class ProductController {
	@Autowired
	private IProductService productService;

//mapping the getProduct() method to /product

	@GetMapping(value = "/product")
	public List<Product> getProduct() {
//finds all the list
		List<Product> list = productService.findAll();
//returns the product list
		return list;
	}

@GetMapping("/product/{productId}")
public Product getProduct(@PathVariable String productId)
{return this.productService.getProductById(Long.parseLong(productId));

}

//mapping the addProduct() method to /product
@PostMapping(path= "/addproduct",consumes = "application/json")
public Product add(@RequestBody Product product)
{
	return this.productService.addProduct(product);
}

@PutMapping(path="/update/{id}",consumes = "application/json")
public String update(@RequestBody Product product ,@PathVariable long id)
{
	this.productService.updateProduct(product,id);

return "update Successful";
}

	@DeleteMapping("/delete/{proId}")
	public String deleteProductById(@PathVariable long proId) {
		this.productService.deleteProduct(proId);
		return "deleted";
	}
}
