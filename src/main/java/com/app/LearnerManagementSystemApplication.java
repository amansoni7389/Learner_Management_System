package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.entity.Course;
import com.app.service.CourseService;

@SpringBootApplication
public class LearnerManagementSystemApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(LearnerManagementSystemApplication.class, args);
	}

	@Autowired
	private CourseService cr;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Course c = Course.builder().id((long) 1.00).courseName("JFSD").build();
		cr.addCourse(c);
		return;
		
		
		
	}

}
