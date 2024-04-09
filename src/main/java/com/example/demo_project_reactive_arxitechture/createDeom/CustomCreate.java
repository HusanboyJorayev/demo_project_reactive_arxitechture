package com.example.demo_project_reactive_arxitechture.createDeom;

import com.example.demo_project_reactive_arxitechture.entity.Student;
import com.example.demo_project_reactive_arxitechture.service.StudentService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CustomCreate {
    private final StudentService service;

    //@PostConstruct
    public String customCreate() {
        for (int i = 1; i <= 100; i++) {
            this.service.save(
                    Student.builder()
                            .name("student " + i)
                            .age(i + 2)
                            .build()
            ).subscribe();
        }
        return "created";
    }

    //@PreDestroy
    public String customDelete() {
        for (int i = 1; i <= 100; i++) {
            this.service.delete(i);
        }
        return "deleted";
    }
}
