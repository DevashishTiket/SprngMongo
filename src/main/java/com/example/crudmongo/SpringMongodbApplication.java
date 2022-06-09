package com.example.crudmongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import repository.BookRepo;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringMongodbApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringMongodbApplication.class, args);
    }


}
