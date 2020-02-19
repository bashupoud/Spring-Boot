package com.project.product.productdemo.repository;

import com.project.product.productdemo.model.Course;

public class CourseRepository {


    public void save(Course course) {
        System.out.println("Course Description: "+ course.getCourseDescription());
        System.out.println("Course CourseID: " +course.getCourseId());
        System.out.println("Course CourseName: " + course.getCourseName());
    }
}
