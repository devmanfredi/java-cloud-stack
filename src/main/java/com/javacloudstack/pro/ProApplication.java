package com.javacloudstack.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.javacloudstack")
public class ProApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProApplication.class, args);
	}

}
