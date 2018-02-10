package com.sree.sbmongo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.sbmongo.domain.ProductCatalog;
import com.sree.sbmongo.repository.ProductCatalogRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
    private ProductCatalogRepository productCatalogRepository;


    @Override
    public List<ProductCatalog> listAll() {
        List<ProductCatalog> products = new ArrayList<>();
        productCatalogRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public ProductCatalog getById(Long id) {
        return productCatalogRepository.findOne(id);
    }

    @Override
    public ProductCatalog saveOrUpdate(ProductCatalog ProductCatalog) {
        productCatalogRepository.save(ProductCatalog);
        return ProductCatalog;
    }

    @Override
    public void delete(Long id) {
        productCatalogRepository.delete(id);
    }
}