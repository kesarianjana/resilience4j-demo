package com.example.resilience4j.Controller;

import org.springframework.stereotype.Service;

@Service
public class FailureService{
    public String getGreeting(){
        System.out.println("Get Greeting of Failure Service Called!");
        throw new RuntimeException();
    }
}