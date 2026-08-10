package com.code.project.fresh.RestAPIs.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private long id;
    public String name;
    public String email;
}
