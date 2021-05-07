package com.bmicheck.service;

import com.bmicheck.entity.BMIEntity;
import org.springframework.stereotype.Service;

@Service
public class BMIServiceImpl implements BMIService{
    @Override
    public BMIEntity calculateBMI(Float height, Float weight) {
        BMIEntity bmiEntity=new BMIEntity(height,weight);
        bmiEntity.setBMIIndex(weight/((height/100)*(height/100)));
        return bmiEntity;
    }
}
