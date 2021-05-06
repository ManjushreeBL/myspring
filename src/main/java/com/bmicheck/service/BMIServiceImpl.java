package com.bmicheck.service;

import com.bmicheck.entity.BMIEntity;


public class BMIServiceImpl implements BMIService{
    @Override
    public BMIEntity calculateBMI(Integer height, Integer weight) {
        BMIEntity bmiEntity=new BMIEntity(height,weight);
        bmiEntity.setBMIIndex(height, weight);
        return bmiEntity;
    }



}
