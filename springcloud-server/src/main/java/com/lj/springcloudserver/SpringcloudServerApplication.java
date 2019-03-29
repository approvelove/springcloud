package com.lj.springcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServerApplication.class, args);
	}

}
