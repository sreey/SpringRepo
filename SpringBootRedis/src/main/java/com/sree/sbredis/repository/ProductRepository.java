package com.sree.sbredis.repository;


import org.springframework.data.repository.CrudRepository;

import com.sree.sbredis.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, String> {

}