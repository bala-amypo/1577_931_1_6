package com.example.demo.entity;

import java.time.LocalDate;

public class CourseCompletion {
    private long id;
    private User user;
    private Course course;
    private LocalDate completionDate;
    private String completionStatus;
    private double scorePercentage;
    public CourseCompletion(){}
    public CourseCompletion(User user, Course course, LocalDate completionDate, String completionStatus,
            double scorePercentage) {
        this.user = user;
        this.course = course;
        this.completionDate = completionDate;
        this.completionStatus = completionStatus;
        this.scorePercentage = scorePercentage;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }
    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }
    public void setScorePercentage(double scorePercentage) {
        this.scorePercentage = scorePercentage;
    }
    public long getId() {
        return id;
    }
    public User getUser() {
        return user;
    }
    public Course getCourse() {
        return course;
    }
    public LocalDate getCompletionDate() {
        return completionDate;
    }
    public String getCompletionStatus() {
        return completionStatus;
    }
    public double getScorePercentage() {
        return scorePercentage;
    }



    
}
