package com.example.demo.entity;

import java.time.LocalDateTime;

public class SkillGap {
    private long id;
    private User user;
    private String skillName;
    private String gapLevel;
    private String suggestion;
    private LocalDateTime generatedOn;
    piblic SkillGap(){}
    public SkillGap(User user, String skillName, String gapLevel, String suggestion, LocalDateTime generatedOn) {
        this.user = user;
        this.skillName = skillName;
        this.gapLevel = gapLevel;
        this.suggestion = suggestion;
        this.generatedOn = generatedOn;
    }
    

    
}
