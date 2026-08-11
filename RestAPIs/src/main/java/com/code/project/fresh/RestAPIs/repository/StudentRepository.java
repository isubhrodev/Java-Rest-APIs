package com.code.project.fresh.RestAPIs.repository;

import com.code.project.fresh.RestAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
