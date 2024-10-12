package com.example.BSpring_cloud_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BSpringCloudConfigServerApplication.class, args);
	}

}
