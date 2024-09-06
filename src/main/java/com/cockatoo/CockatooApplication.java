package com.cockatoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CockatooApplication {

    public static void main(String[] args) {
        SpringApplication.run(CockatooApplication.class, args);
    }

}
