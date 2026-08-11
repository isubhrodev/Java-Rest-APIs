package com.code.project.fresh.RestAPIs.controller;

import java.util.List;

import com.code.project.fresh.RestAPIs.entity.Student;
import com.code.project.fresh.RestAPIs.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @GetMapping("/student")
    public List<Student> getStudent(){
        for(Student student: studentRepository.findAll() )      System.out.println(student.toString());
        return studentRepository.findAll();
    }
}
