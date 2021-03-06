package com.project.product.productdemo.service;

import com.project.product.productdemo.model.Product;
import com.project.product.productdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        return products;
    }

    public void addProduct(Product product) {
        repository.save(product);
    }

    public void addManyProduct(List<Product> products) {
        repository.saveAll(products);
    }

    public void deleteByProductName(String productName) {
        repository.deleteByProductName(productName);

        //productName
    }

    public  List<Product>  findByProductAndDescription(String productName, String productDescription){
        return repository.findByProductCategoryAndProductDescription(productName,productDescription);
    }
}
