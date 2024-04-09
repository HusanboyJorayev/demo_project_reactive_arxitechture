package com.example.demo_project_reactive_arxitechture.service;


import com.example.demo_project_reactive_arxitechture.entity.Student;
import com.example.demo_project_reactive_arxitechture.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Mono<Student> save(Student student) {
        return this.studentRepository.save(student);
    }

    public Flux<Student> findAll() {
        return this.studentRepository.findAll().log();
    }

    public Mono<Student> getById(Integer id) {
        Mono<Student> studentMono = this.studentRepository.findById(id)
                .switchIfEmpty(Mono.error(() -> new RuntimeException("Error")));
        return studentMono;
    }

    public Student getByName(String name) {
        return this.studentRepository.findByName(name).block();
    }

    public String delete(Integer id) {
        this.studentRepository.deleteById(id).subscribe();
        return "deleted";
    }
}
