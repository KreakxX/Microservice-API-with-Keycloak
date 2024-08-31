package com.KreakxX.school;

import jakarta.transaction.Transactional;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository repository;

    private final StudentClient client;

    public void saveSchool(School school){
        repository.save(school);
    }

    public List<School> findAllSchools(){
        return repository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = repository.findById(schoolId).orElse(School.builder().name("NOT_FOUND").build());
        var Students = client.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder().name(school.getName()).email(school.getName()).students(Students).build();
    }
    public School findSchoolById(Integer id){
       return repository.findById(id).orElse(School.builder().name("NOT_FOUND").build());
    }


}