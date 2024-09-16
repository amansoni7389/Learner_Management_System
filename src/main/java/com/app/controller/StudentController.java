package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Course;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    
    @GetMapping("/mycourse/{id}")
    public String getCourses(@PathVariable int id){
        return "okay";
    }

    @GetMapping("/myattendence/{id}")
    public String getAttendence(@PathVariable int id){
        return "okay";
    }

   
}
