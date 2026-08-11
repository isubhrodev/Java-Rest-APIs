package com.code.project.fresh.RestAPIs.controller;

import java.util.List;

import com.code.project.fresh.RestAPIs.dto.StudentDto;
import com.code.project.fresh.RestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student")
    public List<StudentDto> getStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{Id}")
    public String getStudentById(@PathVariable int Id){
        return "Hello "+Id;
    }
}
