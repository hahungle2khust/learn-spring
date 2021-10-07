package com.hungle.mbf.learnspring.controller;

import com.hungle.mbf.learnspring.entities.Products;
import com.hungle.mbf.learnspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/public/products")
//localhost:1103/api/public/products
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public List<Products> findAll() {
        return productService.getAllProducts();
    }
}
