package com.akil.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderSvcApplication.class, args);
	}

}
