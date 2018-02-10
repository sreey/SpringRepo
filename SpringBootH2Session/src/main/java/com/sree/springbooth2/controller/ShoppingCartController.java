package com.sree.springbooth2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sree.springbooth2.domain.ShoppingCart;
import com.sree.springbooth2.service.ShoppingCartService;

@RestController
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;

	/*
	 * URL: http://localhost:8081/item
	 *  * Headers:
	 * Key= content-type value=application/json; charset=UTF-8
	 *  select Body as raw and paste below: 
	 * 
		{
			"productId":14,
			"quantity":31,
			"totalPrice":554,
			"orderAddedDate": "01/23/2017"
		}, 
	 */
	@PostMapping(value = "/item")
	public ResponseEntity<ShoppingCart> save(@RequestBody ShoppingCart shoppingCartItem) {
		shoppingCartService.save(shoppingCartItem);
		return new ResponseEntity<>(shoppingCartItem, HttpStatus.OK);
	}
	
	/* 
	 * URL: http://localhost:8081/items
	 * Headers:
	 * Key= content-type value=application/json; charset=UTF-8
	 * 
	 * Body raw: 
	 * [
		{
			"productId":14,
			"quantity":31,
			"totalPrice":554,
			"orderAddedDate": "01/23/2017"
		}, 
		{
			"productId":4,
			"quantity":1,
			"totalPrice":54,
			"orderAddedDate": "03/23/2017"
		}
		]

	 * 
	 */
	@PostMapping(value = "/items")
	public void saveAll(@RequestBody List<ShoppingCart> shoppingCartItems) {
		shoppingCartService.saveAll(shoppingCartItems);
	}
	
	@GetMapping(value = "/items")
	public List<ShoppingCart> findAll(){
		return shoppingCartService.findAll();
	}
}
