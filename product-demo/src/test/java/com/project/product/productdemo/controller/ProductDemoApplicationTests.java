package com.project.product.productdemo.controller;

import com.project.product.productdemo.model.Product;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductDemoApplicationTests {
    @Autowired
    ProductController productController;

    @Test
    void contextLoads() {
    }

    @Test
    public void testAddProduct() {
        Product product = new Product();
        product.setProductCategory("Test First Product Category");
        product.setProductDescription("Set First Product Description");
        product.setProductName("First Product Name");
        productController.addProduct(product);
    }

    @Test
    public void testGetAddProduct() {
        List<Product> productList = productController.getAllProduct();

    }

    @Test
    public void testAddMany() {
        List<Product> products = new ArrayList<>();

        productController.addOneProduct(products);
    }

    @Test
    public void testUpdateProduct() {
        int id = 1;
        productController.updateProduct(id);
    }

    @Test
    public void testDeleteProduct() {
        // Delete whatever you presist
        String productName = "First Product Name";
        productController.deleteProduct(productName);
        List<Product> productList = productController.getAllProduct();
        int size = productList.size();
        Assert.assertTrue(size == 2);

    }

    @Test
    public void testDeleteOne() {
        int id = 1;
        productController.deleteProductById(id);

        // implement Assertion, verify your record is deleted
    }


}
