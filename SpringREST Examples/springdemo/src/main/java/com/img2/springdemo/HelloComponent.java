package com.img2.springdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class HelloComponent implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("Hello Spring!!!");
		
	}

}
