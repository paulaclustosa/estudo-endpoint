package com.letscode.estudoendpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class EstudoEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoEndpointApplication.class, args);
	}

}
