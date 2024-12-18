package com.javatpoint.microservices.netflixzuulapigatewayserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication  
@EnableEurekaServer  
public class NetflixEurekaNamingServerApplication   
{  
public static void main(String[] args) {  
SpringApplication.run(NetflixEurekaNamingServerApplication.class, args);  
}  
}  