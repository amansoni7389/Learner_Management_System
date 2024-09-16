package com.app.controller;


import com.app.entity.User;
import com.app.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/admin/")
public class AdminController {

    private UserService userService;

    //Comment this code after one run for single root user
    @PostMapping("/createAdmin")
    public ResponseEntity<String> saveAdmin(@RequestBody User user) {
        userService.addUser(user);
        String str = "Admin created successfully";
        return ResponseEntity.ok(str);
    }


}
