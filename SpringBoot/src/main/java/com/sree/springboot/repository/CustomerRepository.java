package com.sree.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sree.springboot.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByFirstName(String firstName);
	
	Customer findByMobileNumber(String mobileNumber);
	
	Customer findByEmailId(String emaiId);
	
	List<Customer> findAll();
	
}

