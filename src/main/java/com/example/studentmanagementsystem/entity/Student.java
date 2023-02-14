package com.example.studentmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first-name", nullable = false)
    private String firstName;
    @Column(name = "last-name")
    private String lastName;
    @Column(name = "email")
    private String email;

    public Student(){

    }
    public Student(String firstName, String lastName, String email){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
