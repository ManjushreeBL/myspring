package com.mysample.controller;

import com.mysample.model.Beer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/test")
@RestController
@RequiredArgsConstructor
public class MyController {
    String beerName;
    @GetMapping({"/{beerName}"})
    public  ResponseEntity<Beer>  getbyID(@PathVariable String beerName){
        return new ResponseEntity<Beer>(Beer.builder().build(), HttpStatus.OK);
        
    }

}
