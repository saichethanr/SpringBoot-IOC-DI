package com.sai.SpringBootFirst;

import com.sai.SpringBootFirst.model.Alien;
import com.sai.SpringBootFirst.model.Laptop;
import com.sai.SpringBootFirst.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		//we can acess the Ioc container using the application context object
		//the run method return the Application context method
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		System.out.println("hello world");

		//i want spring to create this object i dont want to do it manually
		// this will return an error only when we mention explicityly the object creation then only the spring creates an obect
		//hence use annotations
//		Alien obj = obj1.getBean(Alien.class);
//		obj.code();

		Laptop lap = new Laptop();
		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptop(lap);



        //now what if Alien was depended on some other class
	}

}
