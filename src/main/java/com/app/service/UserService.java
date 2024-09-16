package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.repository.StudentRepository;

@Service
public class UserService {
	 @Autowired
	    private StudentRepository studentRepository;

	    // Add a new student
	    public Student addStudent(Student student) {
	        // Additional logic, like assigning default values or checking constraints
	        return studentRepository.save(student);
	    }

	    // Update an existing student
	    public Student updateStudent(Student student) {
	        // Check if student exists before updating
	        return studentRepository.save(student);
	    }

	    // Delete a student by ID
	    public void deleteStudent(Long studentId) {
	        studentRepository.deleteById(studentId);
	    }

	    // Get student by ID
	    public Optional<Student> getStudentById(Long id) {
	        return studentRepository.findById(id);
	    }

	    // Get all students
	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }
}

