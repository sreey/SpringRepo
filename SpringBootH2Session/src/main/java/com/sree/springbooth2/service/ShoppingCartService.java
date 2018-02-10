package com.sree.springbooth2.service;

import java.util.List;

import com.sree.springbooth2.domain.ShoppingCart;

public interface ShoppingCartService {

	public void save(ShoppingCart shoppingCartItem);
	
	public void saveAll(List<ShoppingCart> shoppingCartItems);
	
	public List<ShoppingCart> findAll();
}
