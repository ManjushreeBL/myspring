package com.fileprocessing.controller;

import com.fileprocessing.service.FileService;
import com.fileprocessing.service.FileServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileController {
    public String[] getFile(Path path) throws IOException {

        FileService myService = new FileServiceImpl();
        String line=null;
        try {
            path= Paths.get("C:\\Users\\Vinay\\javaProjects\\demo\\src\\main\\resources\\file.txt");
            InputStream inputStream = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            line = reader.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return myService.calculateFile(line);
    }
}
