package com.sai.SpringBootFirst.service;

import com.sai.SpringBootFirst.model.Laptop;
import com.sai.SpringBootFirst.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//service does the same thing that the component does
@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        repo.save(lap);

    }
    public boolean isGoodForProg(){
        return true;
    }
}
