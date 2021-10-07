package com.hungle.mbf.learnspring.service;

import com.hungle.mbf.learnspring.entities.Products;
import com.hungle.mbf.learnspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepo;

    @Override
    public List<Products> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public void saveProduct(Products products) {
        productRepo.save(products);
    }

    @Override
    public Products findProductById(Integer pId) {
        return productRepo.findById(pId).get();
    }

    @Override
    public void deleteProduct(Integer pId) {
        productRepo.deleteById(pId);
    }

}
