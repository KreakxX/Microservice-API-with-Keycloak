package com.KreakxX.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findAllBySchoolid(Integer schoolId);
    Student findByEmail(String email);

}
