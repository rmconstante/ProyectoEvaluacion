package com.microservicios.app.matricula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MicroservicioMatriculaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioMatriculaApplication.class, args);
	}

}
