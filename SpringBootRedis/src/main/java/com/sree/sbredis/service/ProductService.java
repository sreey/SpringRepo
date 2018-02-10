package com.sree.sbredis.service;

import java.util.List;

import com.sree.sbredis.domain.Product;

public interface ProductService {
	
	List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

}
