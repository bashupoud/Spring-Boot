package com.project.product.productdemo.repository;

import com.project.product.productdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, String> {
    void deleteByProductName(String productName);
    // Product Repository specific

    // JPQL
    @Query("SELECT u FROM Product u WHERE u.productName = :name and u.productDescription = :description")
    List<Product> findByProductNameAndProductDescription(@Param("name") String productName, @Param("description") String productDescription);

    // with Native Query
    @Query(value = "SELECT * FROM SIMPLE_PRODUCT p WHERE p.product_Name = :productName AND p.product_Description = :productDescription"
            , nativeQuery = true)
    List<Product> findByProductCategoryAndProductDescription(@Param("productName") String productName, @Param("productDescription") String productDescription);
}
