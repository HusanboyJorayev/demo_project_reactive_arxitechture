package com.example.demo_project_reactive_arxitechture.controller;

import com.example.demo_project_reactive_arxitechture.entity.Student;
import com.example.demo_project_reactive_arxitechture.repository.StudentRepository;
import com.example.demo_project_reactive_arxitechture.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("student")
public class StudentController {
    private final StudentService service;
    private final StudentRepository studentRepository;

    @PostMapping("/create")
    @Operation(summary = "Save student")
    public Mono<Student> save(@RequestBody Student student) {
        return this.service.save(student);
    }

    @GetMapping("/findAll")
    @Operation(summary = "Get all students")
    public Flux<Student> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/get/{id}")
    @Operation(summary = "get student by id")
    public Mono<ResponseEntity<Student>> getById(@PathVariable("id") Integer id) {
        return this.service.getById(id)
                .map(ResponseEntity::ok);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "delete student by id")
    public String delete(@PathVariable("id") Integer id) {
        return this.service.delete(id);
    }

    @GetMapping("/get/{name}")
    @Operation(summary = "get student by name")
    public Mono<Student> getByName(@PathVariable("name") String name) {
        return this.studentRepository.findByName(name);
    }
}
