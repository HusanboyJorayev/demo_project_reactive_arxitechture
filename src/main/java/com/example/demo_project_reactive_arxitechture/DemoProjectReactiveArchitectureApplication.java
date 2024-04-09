package com.example.demo_project_reactive_arxitechture;

import com.example.demo_project_reactive_arxitechture.entity.Student;
import com.example.demo_project_reactive_arxitechture.service.StudentService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class DemoProjectReactiveArchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProjectReactiveArchitectureApplication.class, args);
    }
}

