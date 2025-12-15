package com.example.demo.entity;

public class Course {
    private long id;
    private String courseCode;
    private String courseName;
    private String category;
    private String skillTags;
    public Course(){}
    public Course(String courseCode,String courseName,String category,String skillTags){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.category=category;
        this.skillTags=skillTags;

    }
    public void setId(long id){
        this.id=id;
    }
    public void setCourseCode(String courseCode){
        this.courseCode=courseCode;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setSkillTags(String skillTags){
        this.skillTags=skillTags;
    }
    

}
