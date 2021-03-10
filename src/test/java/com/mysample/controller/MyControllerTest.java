package com.mysample.controller;


import com.mysample.model.Beer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertNotNull;



public class MyControllerTest {
    MyController myController=new MyController();
    @Test
    public void getByIDTest(){
        Beer beer1=Beer.builder()
                .beerName("Manju").beerstyle("Ace")
                .build();


        assertNotNull( myController.getbyID(beer1.getBeerName()));
        System.out.println(myController.getbyID(beer1.getBeerName()));
    }
    @Test
    public void printInputFile() throws IOException {
        assertNotNull(myController.getFile(Path.of("/file.txt")));
        System.out.println(myController.getFile(Path.of("/file.txt")));
    }
}
