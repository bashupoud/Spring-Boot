package com.project.product.productdemo.repository;


import com.project.product.productdemo.model.CourseModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CourseRepo extends CrudRepository<CourseModel, Integer> {

}
