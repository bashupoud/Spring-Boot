package com.project.product.productdemo.service;

import com.project.product.productdemo.model.CourseCategory;
import com.project.product.productdemo.repository.CourseCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseCategoryService {
    @Autowired
    private CourseCategoryRepo courseCategoryRepo;

    public List<CourseCategory> getAllCourseCategory() {

        List<CourseCategory> courseCategories = new ArrayList<>();
        return courseCategoryRepo.findAll();//.forEach(courseCategories::add);

    }

    public void addCourseCategory(CourseCategory courseCategory) {

        courseCategoryRepo.save(courseCategory);
    }


}
