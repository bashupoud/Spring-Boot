package com.project.product.productdemo.controller;

import com.project.product.productdemo.model.Product;
import com.project.product.productdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/product")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }
              /*List<Product> productList = new ArrayList<>(Arrays.asList(
                new Product("1", "speaker", "bluetooth speaker","gadget"),
                new Product("2", "monitor", "LED","gadget"),
                new Product("3", "tv", "4k","gadget")));*/


}
