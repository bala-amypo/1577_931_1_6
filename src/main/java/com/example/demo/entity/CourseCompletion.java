package com.example.demo.entity;

import java.time.LocalDate;

public class CourseCompletion {
    private long id;
    private User user;
    private Course course;
    private LocalDate completionDate;
    private String completionStatus;
    private double scorePercentage;
}
