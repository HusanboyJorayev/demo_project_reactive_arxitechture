package com.example.demo_project_reactive_arxitechture.repository;

import com.example.demo_project_reactive_arxitechture.entity.Student;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {
    Flux<Student> findAllByNameIgnoreCase(String name);

    Mono<Student> getStudentById(Integer id);

    @Query("""
            select * from Student where name=:name
            """)
    Mono<Student> findByName(String name);
}
