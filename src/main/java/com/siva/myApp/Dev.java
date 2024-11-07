package com.siva.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    private Computer com;
    public  void build(){
        System.out.println("im working on crazy project.....");
        com.compile();
    }
}
