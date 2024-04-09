package com.example.demo_project_reactive_arxitechture.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students_table")
public class Student {
    @Id
    private Integer id;
    private String name;
    private int age;
}
