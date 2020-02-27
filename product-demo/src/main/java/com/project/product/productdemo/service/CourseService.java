package com.project.product.productdemo.service;

import com.project.product.productdemo.model.CourseModel;
import com.project.product.productdemo.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;


    public List<CourseModel> getAllCourses() {

        List<CourseModel> courseModel = new ArrayList<>();
        courseRepo.findAll()
                .forEach(courseModel::add);
        return courseModel;

    }

    public Optional<CourseModel> getCourse(int id) {

        return courseRepo.findById(id);
        // select * from COURSE where id ='';


    }

    public void addCourse(CourseModel course) {

        courseRepo.save(course);
    }

    public void updateCourse(CourseModel course) {

        if (courseRepo.existsById(course.getCourseId())) {
            courseRepo.save(course);
        }

    }

    public void deleteCourse(int id) {

        courseRepo.deleteById(id);

    }

}
