package com.TAN.LAB9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab9Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab9Application.class, args);
        System.out.println("=========================================");
        System.out.println("Product Management API Started Successfully!");
        System.out.println("REST API: http://localhost:8080/api/products");
        System.out.println("GraphQL Endpoint: http://localhost:8080/graphql");
        System.out.println("GraphiQL UI: http://localhost:8080/graphiql");
        System.out.println("=========================================");
    }

}
