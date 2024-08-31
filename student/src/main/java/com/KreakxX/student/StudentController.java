package com.KreakxX.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")          //optional for when using JWT
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)     // if for deciding which http status should be displayed when using this method/request
    public void saveStudent(@RequestBody Student student){
        service.saveStudent(student);
    }

    @GetMapping("/all")
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }

    @GetMapping("/school/{school-id}")
    public List<Student> findAllStudentsBySchoolId(@PathVariable("school-id") Integer schoolId){
        return service.findAllStudentsBySchool(schoolId);
    }
    @GetMapping("/student/{email}")
    public Student findStudentByEmail(@PathVariable("email") String email){
        return service.findStudentByEmail(email);
    }
    @GetMapping("/find/school/{school-id}")
    public School findSchoolBySchoolId(@PathVariable("school-id")Integer schoolId){
        return service.findSchoolById(schoolId);
    }
}
