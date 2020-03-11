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
    public void addManyProduct(@RequestBody List<Product> products) {
        productService.addManyProduct(products);

    }


    @DeleteMapping("/{productName}")
    public void deleteProduct(@PathVariable String productName) {
        productService.deleteByProductName(productName);

    }

    @GetMapping("/{productName}/{productDescription}")
    public List<Product> findByProductNameAndDescription(@PathVariable String productName, String productDescription) {
        return productService.findByProductAndDescription(productName, productDescription);
    }


    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable int id) {
        // TODO: implement

    }


    @PutMapping("/{id}")
    public void updateProduct(int id) {
    }
}
