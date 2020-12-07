package com.martinhwang.springboot2java11crudjpamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Springboot2java11crudjpamysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2java11crudjpamysqlApplication.class, args);
    }

}
