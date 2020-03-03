package com.project.product.productdemo.controller;

import com.project.product.productdemo.model.Product;
import com.project.product.productdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-demo")
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

    @PostMapping("/addMoreProducts")
    public void addOneProduct(@RequestBody List<Product> products) {

    }


    @DeleteMapping("/{productName}")
    public void deleteProduct(@PathVariable String productName) {

    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable int id) {
        // TODO: implement

    }


    @PutMapping("/{id}")
    public void updateProduct(int id) {
    }
}
