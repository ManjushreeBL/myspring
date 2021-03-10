package com.fileprocessing.service;

public class FileServiceImpl implements FileService{
    @Override
    public  String[] calculateFile(String line) {

        System.out.println(line.split("|",100));
        return line.split("|",100);
    }
}
