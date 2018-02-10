package com.sree.springboot.service;

import java.util.List;

import com.sree.springboot.domain.Customer;


public interface CustomerService {

	public List<Customer> findAll();
}
