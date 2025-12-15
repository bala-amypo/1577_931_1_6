package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CourseCompletion;

public interface CompletionService {
    CourseCompletion logCompletetion(long userId,long courseId,double scorePercentage);
    List<CourseCompletion> getCompletionsForUser(long userId);
    double getSkillCoverageScore(long userId);
}
