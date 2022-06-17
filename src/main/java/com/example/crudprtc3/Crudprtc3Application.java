package com.example.crudprtc3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Crudprtc3Application {

    public static void main(String[] args) {
        SpringApplication.run(Crudprtc3Application.class, args);
    }

}
