package com.sree.sbmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sree.sbmongo.domain.ProductCatalog;
import com.sree.sbmongo.service.ProductService;

@RestController
public class ProductCatalogController {

	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public String redirToList() {
		return "redirect:/product/list";
	}

	@GetMapping({ "/products/list", "/products" })
	public List<ProductCatalog> listProducts() {
		return productService.listAll();
	}




	@GetMapping(value = "/products/{productId}")
	public ProductCatalog getById(@PathVariable("productId") Long id) {
		return productService.getById(id);
	}
	/*
	 * 
	 *
Header: content-type: application\json
Body:
{
	"id": 131,
	"name" : "Phone 5 Inch",
	"price" : 10000,
	"quantity" : 88
}
	 */
	@PostMapping (value = "/product")
	public ProductCatalog saveOrUpdate(@RequestBody ProductCatalog ProductCatalog) {
		productService.saveOrUpdate(ProductCatalog);
		return ProductCatalog;
	}

	 @DeleteMapping("/products/{productId}")
	public void delete(@PathVariable("productId") Long id) {
		productService.delete(id);
	}
}
