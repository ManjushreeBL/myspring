package com.bmicheck.controller;

import com.bmicheck.entity.BMIEntity;
import com.bmicheck.service.BMIService;
import com.bmicheck.service.BMIServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class BMIController {
    @GetMapping({"/{height}/{weight}"})
    public ResponseEntity<BMIEntity> checkBMI(@PathVariable("height") Float height, @PathVariable("weight") Float weight){
        BMIService bmiservice=new BMIServiceImpl();
        BMIEntity bmiEntity=bmiservice.calculateBMI(height,weight);
        return new ResponseEntity<>(bmiEntity,HttpStatus.OK);
           }
}
