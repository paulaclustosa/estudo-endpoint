package com.letscode.estudoendpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.letscode.estudoendpoint.controller", "com.letscode.estudoendpoint.service", "com.letscode.estudoendpoint.repository"})
public class EstudoEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoEndpointApplication.class, args);
	}

}
