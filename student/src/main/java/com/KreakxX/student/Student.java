package com.KreakxX.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Builder            // Annotations for Entities
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstname;

    private String lastname;

    private String email;

    private Integer schoolid;


}
