package com.sree.sbmongo.service;

import java.util.List;

import com.sree.sbmongo.domain.ProductCatalog;

public interface ProductService {

    List<ProductCatalog> listAll();

    ProductCatalog getById(Long id);

    ProductCatalog saveOrUpdate(ProductCatalog ProductCatalog);

    void delete(Long id);

}