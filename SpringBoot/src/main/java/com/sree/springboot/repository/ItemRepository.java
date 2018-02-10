package com.sree.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sree.springboot.domain.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

	Item findByName(String name);
	
	List<Item> findAll();
}
