package com.bmicheck.service;

import com.bmicheck.entity.BMIEntity;

public interface BMIService {
    public BMIEntity calculateBMI(Integer height, Integer weight);
}
