package com.code.project.fresh.RestAPIs.service.Impl;


import com.code.project.fresh.RestAPIs.dto.StudentDto;
import com.code.project.fresh.RestAPIs.entity.Student;
import com.code.project.fresh.RestAPIs.repository.StudentRepository;
import com.code.project.fresh.RestAPIs.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        list<StudentDto> studentDtoList = students
                .stream()
                .map( student -> new StudentDto(student.getId(), student.getName(), student.getEmail()))
                .toList();

        return List.of();
    }
}
