package com.edu.ulab.app.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "User fullName is null")
    @Size(min = 2, message = "Length user fullName must be greater than 2")
    private String fullName;

    @NotNull(message = "User title is null")
    @Size(min = 2, message = "Length user title must be greater than 2")
    private String title;

    @Min(value = 0, message = "User age over 0")
    private int age;
}
