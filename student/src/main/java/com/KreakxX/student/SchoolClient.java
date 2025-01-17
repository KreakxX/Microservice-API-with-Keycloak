package com.KreakxX.student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "school-service" , url = "${application.config.school-url}")
public interface SchoolClient {

    @GetMapping("/{school-id}")
    public School findSchoolById(@PathVariable("school-id") Integer schoolId);
}
