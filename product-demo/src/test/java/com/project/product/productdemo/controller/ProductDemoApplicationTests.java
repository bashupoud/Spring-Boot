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
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        // Test what ever you add is actually there
        List<Product> productList = productController.getAllProduct();
        Stream<Product> product1 = productList.stream().filter(prd -> prd.getProductCategory().equals("Test First Product Category"));
        List<Product> list = product1.collect(Collectors.toList());
        int size = list.size();
        Assert.assertEquals(1, size);
        // Delete whatever you presist
        productController.deleteProduct(product.getProductName());
        List<Product> prdList = productController.getAllProduct();
        int prdSize = prdList.size();
        Assert.assertEquals(prdSize, 0);

    }

    @Test
    public void testGetAddProduct() {
        List<Product> productList = productController.getAllProduct();
        Stream<Product> product1 = productList.stream().filter(product -> product.getProductCategory().equals("Test First Product Category"));
        List<Product> list = product1.collect(Collectors.toList());
        int size = list.size();
        Assert.assertEquals(size, 1);

    }

    @Test
    public void testAddMany() {
        List<Product> products = new ArrayList<>();
        productController.addManyProduct(products);
        List<Product> products1 = productController.getAllProduct();
        int size = products1.size();
    }

    @Test
    public void testUpdateProduct() {
        int id = 1;
        productController.updateProduct(id);
    }

    @Test
    public void testDeleteProduct() {
        // Delete whatever you presist
        String productName = "Product Name";

        productController.deleteProduct(productName);
        List<Product> productList = productController.getAllProduct();
        int size = productList.size();
        Assert.assertEquals(size, 0);

    }

    @Test
    public void testDeleteOne() {
        int id = 1;
        productController.deleteProductById(id);

        // implement Assertion, verify your record is deleted
    }

    @Test
    public void getByProductNameAndDescription() {

        Product product = new Product();
        product.setProductCategory("Category");
        product.setProductDescription("Description");
        product.setProductName("Name");
        productController.addProduct(product);

        List<Product> productList = productController.findByProductNameAndDescription(product.getProductName(), product.getProductDescription());
        System.out.println("Product List Size: " + productList.size());

    }


}
