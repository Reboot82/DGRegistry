package com.bcampbell.discgolf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bcampbell.discgolf.models.Course;

@RestController
@RequestMapping("/api/v1/discgolf")
public class CourseController {

	@GetMapping
	public List<Course> list() {
		List<Course> courses = new ArrayList<>();
		return courses;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Course course) {
		
	}
	
	@GetMapping("/{id}")
	public Course get(@PathVariable("id") long id) {
		return new Course();
	}
	
}
