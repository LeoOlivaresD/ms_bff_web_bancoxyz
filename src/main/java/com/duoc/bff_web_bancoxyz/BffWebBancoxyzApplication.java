package com.duoc.bff_web_bancoxyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableFeignClients
public class BffWebBancoxyzApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffWebBancoxyzApplication.class, args);
	}

}
