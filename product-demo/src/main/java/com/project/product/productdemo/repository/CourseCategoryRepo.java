package com.project.product.productdemo.repository;

import com.project.product.productdemo.model.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CourseCategoryRepo extends JpaRepository<CourseCategory,Integer> {
}
