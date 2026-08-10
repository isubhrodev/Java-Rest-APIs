package com.code.project.fresh.RestAPIs.controller;


import com.code.project.fresh.RestAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(21,"Subhrodev","subhrodebb@gmail.com");
    }
}
