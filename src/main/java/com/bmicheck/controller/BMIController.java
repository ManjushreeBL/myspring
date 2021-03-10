package com.bmicheck.controller;

import com.bmicheck.entity.BMIEntity;
import com.bmicheck.service.BMIService;
import com.bmicheck.service.BMIServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMIController {
    @GetMapping("/bmicheck")
    public ResponseEntity<BMIEntity> checkBMI(){
        BMIService impl=new BMIServiceImpl();
        impl.calculateBMI();
        return
    }
}
