package com.uce.edu.ec.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.demo.modelo.Vuelo;
import com.uce.edu.ec.demo.service.IVueloService;

@SpringBootApplication
public class ExamenFinalDfApplication implements CommandLineRunner{
	
	@Autowired
	private IVueloService iVueloService;

	public static void main(String[] args) {
		SpringApplication.run(ExamenFinalDfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

}
