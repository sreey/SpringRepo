package com.sree.sbmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sree.sbmongo.domain.ProductCatalog;

public interface ProductCatalogRepository extends MongoRepository<ProductCatalog, Long>{

}
