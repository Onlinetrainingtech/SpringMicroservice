package com.example.springcloudconfigserverP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication

public class SpringCloudConfigServerP1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerP1Application.class, args);
	}

}
