package com.KreakxX.student;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    private final SchoolClient client;

    public void saveStudent(Student student){
        repository.save(student);
    }

    public List<Student> findAllStudents(){
        return repository.findAll();
    }


    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return  repository.findAllBySchoolid(schoolId);
    }

    public Student findStudentByEmail(String email){
        return repository.findByEmail(email);
    }

    public School findSchoolById (Integer schoolId){
        return client.findSchoolById(schoolId);
    }
}
