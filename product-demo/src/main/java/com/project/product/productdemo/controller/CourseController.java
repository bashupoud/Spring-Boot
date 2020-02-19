package com.project.product.productdemo.controller;

import com.project.product.productdemo.model.Course;
import com.project.product.productdemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    CourseService courseService = new CourseService();


    @GetMapping("/course")
    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }
    @PostMapping("/course")
    public void addCourse(@RequestBody Course course){
        courseService.addAllCourse(course);

    }
    @GetMapping("/course/id")
    public void addCourse( String id){
        //courseService.addAllCourse(id);

    }
    //CRUD

    //course/courseName

}
