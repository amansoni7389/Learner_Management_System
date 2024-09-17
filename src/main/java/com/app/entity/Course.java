package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Course {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String courseName;

//    @ManyToOne
//    @JoinColumn(name = "teacher_id")
//    private User teacher;

   
}

