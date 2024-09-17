package com.app.service;

import java.util.Optional;

import com.app.entity.Course;

public interface CourseInterface {
   
	Course addCourse(Course course);
    
	void updateCourse(Course course);
    
	Optional<Course> getCourseById(Long id);
}
