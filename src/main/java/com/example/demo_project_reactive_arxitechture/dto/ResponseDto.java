package com.example.demo_project_reactive_arxitechture.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto <T>{
    private int code;
    private T data;
    private String message="Error";
}
