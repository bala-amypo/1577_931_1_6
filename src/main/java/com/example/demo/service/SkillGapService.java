package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.SkillGap;

public interface SkillGapService {
    List<SkillGap> generateSkillGaps(long userId);
    List<SkillGap> getSkillGapsForUser(long userId);
}
