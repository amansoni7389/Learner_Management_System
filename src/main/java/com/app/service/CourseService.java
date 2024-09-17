package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Course;
import com.app.repository.CourseRepository;

@Service
public class CourseService implements CourseInterface {

	
	@Autowired
	private CourseRepository courseRepo;
	
    @Override
    public Course addCourse(Course course) {
    	courseRepo.save(course);
        return course;
    }

    @Override
    public void updateCourse(Course course) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCourse'");
    }

	@Override
	public Optional<Course> getCourseById(Long id) {
		
		return Optional.empty();
	}
    
}
