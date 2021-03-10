package com.mysample.controller;

import com.mysample.model.Beer;
import com.mysample.service.ManipulateServiceImpl;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@RequestMapping("/test")
@RestController
@RequiredArgsConstructor
public class MyController {
    String beerName;
    @GetMapping({"/{beerName}"})
    public  ResponseEntity<Beer>  getbyID(@PathVariable String beerName){
        return new ResponseEntity<Beer>(Beer.builder().build(), HttpStatus.OK);
        
    }


    public String[] getFile(Path path) throws IOException {

        ManipulateServiceImpl myService = new ManipulateServiceImpl();
        String line=null;
        try {
            path= Paths.get("C:\\Users\\Vinay\\javaProjects\\demo\\src\\main\\resources\\file.txt");
            InputStream inputStream = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            line = reader.toString();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return myService.calculateFile(line);
    }
}
