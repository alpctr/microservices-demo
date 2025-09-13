package com.alpctr.microservices.product;

import org.springframework.boot.SpringApplication;

public class TestProductServiveApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductServiveApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
