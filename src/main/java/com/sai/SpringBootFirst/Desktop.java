package com.sai.SpringBootFirst;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compile(){
        System.out.println("Desktop Compilted");
    }
}
