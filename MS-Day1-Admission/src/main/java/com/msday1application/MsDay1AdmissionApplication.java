package com.msday1application;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MsDay1AdmissionApplication {

	public static void main(String[] args) {
		System.out.println("adminssion");
		SpringApplication.run(MsDay1AdmissionApplication.class, args);
	}

}
