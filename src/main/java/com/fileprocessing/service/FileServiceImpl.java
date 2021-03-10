package com.fileprocessing.service;

public class FileServiceImpl implements FileService{
    @Override
    public  String[] calculateFile(String line) {
        return line.split("|",100);
    }
}
