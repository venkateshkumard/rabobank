package com.cts.rabobank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@EnableSwagger2
@RestController
public class CustomerStatementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerStatementServiceApplication.class, args);
        System.out.println("test");
    }
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    
    @GetMapping(value = "/")
    public String index() {
        return "Welcome Venkat, Demo Application deployed via CI-CD Azure pipeline ....";
    }
}
