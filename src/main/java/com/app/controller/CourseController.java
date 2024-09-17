package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.entity.Course;
import com.app.service.CourseInterface;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseInterface courseInterface;

    // Create a new course
    @PostMapping
    public ResponseEntity<String> saveCourse(@RequestBody Course course) {
        try {
            courseInterface.addCourse(course);
            return new ResponseEntity<>("Course added successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error occurred while adding course: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Get all courses
//    @GetMapping("/getAll")
//    public ResponseEntity<List<Course>> getAllCourses() {
//        try {
//            List<Course> courses = courseInterface.getAllCourses();
//            return new ResponseEntity<>(courses, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    // Get a course by ID
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        try {
            Optional<Course> course = courseInterface.getCourseById(id);
            if (course.isPresent()) {
                return new ResponseEntity<>(course.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Update a course by ID
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCourse(@PathVariable Long id, @RequestBody Course updatedCourse) {
        try {
            Optional<Course> existingCourse = courseInterface.getCourseById(id);
            if (existingCourse.isPresent()) {
                updatedCourse.setId(id); // Set the ID of the updated course
                courseInterface.updateCourse(updatedCourse);
                return new ResponseEntity<>("Course updated successfully!", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Course not found with ID: " + id, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error occurred while updating course: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Delete a course by ID
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteCourse(@PathVariable Long id) {
//        try {
//            Optional<Course> course = courseInterface.getCourseById(id);
//            if (course.isPresent()) {
//                courseInterface.deleteCourse(id);
//                return new ResponseEntity<>("Course deleted successfully!", HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>("Course not found with ID: " + id, HttpStatus.NOT_FOUND);
//            }
//        } catch (Exception e) {
//            return new ResponseEntity<>("Error occurred while deleting course: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}

