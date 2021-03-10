package com.mysample.service;

public class ManipulateServiceImpl implements ManipulateService{
    @Override
    public  String[] calculateFile(String line) {
        return line.split("|",100);
    }
}
