package com.project.product.productdemo.service;

import com.project.product.productdemo.model.Course;
import com.project.product.productdemo.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseService {
    public List<Course> getAllCourse() {

        List<Course> courseList = new ArrayList<>(Arrays.asList(
                new Course(1, "Spring Boot", "Learning Spring Bootr"),
                new Course(2, "Java", "Learning Java"),
                new Course(3, "Web Development", "Learning Web Development"),
                new Course(4, "JPA", "Learning JPA"),
                new Course(5, "Database", "Learning h2-database"),
                new Course(6, "Rest API", "Learning Rest Services"),
                new Course(7, "React", "Learning React")));


        return courseList;

    }


    public void addAllCourse(Course course) {
        CourseRepository courseRepository = new CourseRepository();
        courseRepository.save(course);


    }
}
