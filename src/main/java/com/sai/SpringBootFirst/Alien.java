package com.sai.SpringBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//only those objects will be created by spring which has component on top of the class
@Component
public class Alien {

    @Autowired
    Laptop laptop;
    public  void code(){
        laptop.compile();
        System.out.println("i am an Alien");
    }
}
