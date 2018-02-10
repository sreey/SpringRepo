package com.sree.springbooth2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.springbooth2.domain.ShoppingCart;
import com.sree.springbooth2.repository.ShoppingCartRepository;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
	
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;

	public void save(ShoppingCart shoppingCartItem) {
		shoppingCartRepository.save(shoppingCartItem);
	}
	
	public void saveAll(List<ShoppingCart> shoppingCartItems) {
		shoppingCartRepository.save(shoppingCartItems);
	}
	
	public List<ShoppingCart> findAll(){
		return shoppingCartRepository.findAll();
	}
	
}
