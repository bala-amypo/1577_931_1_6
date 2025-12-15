package com.example.demo.entity;

import java.time.LocalDateTime;

public class SkillGap {
    private long id;
    private User user;
    private String skillName;
    private String gapLevel;
    private String suggestion;
    private LocalDateTime generatedOn;
    public SkillGap(){}
    public SkillGap(User user, String skillName, String gapLevel, String suggestion, LocalDateTime generatedOn) {
        this.user = user;
        this.skillName = skillName;
        this.gapLevel = gapLevel;
        this.suggestion = suggestion;
        this.generatedOn = generatedOn;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    public void setGapLevel(String gapLevel) {
        this.gapLevel = gapLevel;
    }
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
    public void setGeneratedOn(LocalDateTime generatedOn) {
        this.generatedOn = generatedOn;
    }
    public long getId() {
        return id;
    }
    public User getUser() {
        return user;
    }
    public String getSkillName() {
        return skillName;
    }
    public String getGapLevel() {
        return gapLevel;
    }
    public String getSuggestion() {
        return suggestion;
    }
    public LocalDateTime getGeneratedOn() {
        return generatedOn;
    }
    

    
}
