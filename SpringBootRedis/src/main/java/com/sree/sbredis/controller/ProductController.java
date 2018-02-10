package com.sree.sbredis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sree.sbredis.domain.Product;
import com.sree.sbredis.service.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public String redirToList() {
		return "redirect:/product/list";
	}

	@GetMapping({ "/products/list", "/products" })
	public List<Product> listProducts() {
		return productService.listAll();
	}




	@GetMapping(value = "/products/{productId}")
	public Product getById(@PathVariable("productId") String id) {
		return productService.getById(id);
	}
	/*
	 * 
	 *
Header: content-type: application\json
Body:
{
	"id": 131,
	"name" : "Redis Phone 5 Inch",
	"price" : 10000,
	"quantity" : 88
}
	 */
	@PostMapping (value = "/product")
	public Product saveOrUpdate(@RequestBody Product product) {
		productService.saveOrUpdate(product);
		return product;
	}

	 @DeleteMapping("/products/{productId}")
	public void delete(@PathVariable("productId") String id) {
		productService.delete(id);
	}
}
