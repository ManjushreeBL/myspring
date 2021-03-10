package com.mysample.controller;

import com.mysample.model.Beer;
import com.mysample.service.BeerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/test")
@RestController
@RequiredArgsConstructor
public class MyController {
    String beerName;
    BeerServiceImpl beerService=new BeerServiceImpl();
    @GetMapping({"/{beerName}"})
    public  ResponseEntity<Beer>  getbyID(@PathVariable String beerName){
        return new ResponseEntity<Beer>(Beer.builder().build(), HttpStatus.OK);
        
    }
    @PostMapping("/mylist")
    public void putallrecords(){
        beerService.putMyList();
    }

}
