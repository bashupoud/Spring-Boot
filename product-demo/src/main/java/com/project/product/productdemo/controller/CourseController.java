package com.project.product.productdemo.controller;

import com.project.product.productdemo.model.CourseModel;
import com.project.product.productdemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
	// your course controller goes here
	@Autowired
	private CourseService courseService;

	@GetMapping("/course")
	public List<CourseModel> getAllCourse() {

		List<CourseModel> cm = courseService.getAllCourses();
		return cm;
	}

//	@GetMapping("/welcome")
//	public ModelAndView getAllCourses() {
//		ModelAndView modelAndView = new ModelAndView();
//		List<CourseModel> cm = courseService.getAllCourses();
//		modelAndView.addObject(cm);
//		return modelAndView;
//
//	}




	@GetMapping("/course/{id}")
	public Optional<CourseModel> getCourse(@PathVariable int id) {
		return courseService.getCourse(id);

	}

	@PostMapping("/course")
	public void addCourse(@RequestBody CourseModel course) {
		courseService.addCourse(course);

	}

/*	@PutMapping("/course/{id}")
	public void updateCourse(@RequestBody CourseModel course) {
		courseService.updateCourse(course);

	}

	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable int id) {
		courseService.deleteCourse(id);

	}*/
}
