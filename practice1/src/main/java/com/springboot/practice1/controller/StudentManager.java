package com.springboot.practice1.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class StudentManager {
    public String getInfo(){
        return "Hello Inside manager";
    }
}
