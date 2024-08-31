package com.KreakxX.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSchool(@RequestBody School school){
        service.saveSchool(school);
    }

    @GetMapping("/with-students/{school-id}")
    public FullSchoolResponse findAllSchoolsWithStudents(@PathVariable("school-id") Integer schoolId){
        return service.findSchoolsWithStudents(schoolId);
    }
    @GetMapping("/{school-id}")
    public School findSchoolById(@PathVariable("school-id") Integer schoolid){
        return service.findSchoolById(schoolid);
    }

}
