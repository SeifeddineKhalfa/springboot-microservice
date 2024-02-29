package com.esprit.edgems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EdgeMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdgeMsApplication.class, args);
    }

}
