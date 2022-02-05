package kr.co.hunger.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HungerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HungerEurekaApplication.class, args);
    }

}