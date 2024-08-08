package com.sai.SpringBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//only those objects will be created by spring which has component on top of the class
@Component
public class Alien {
    @Value("25")
    private int age;

    private Computer com;

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void code(){
        com.compile();
        System.out.println("i am an Alien");
    }
}
