package com.edu.ulab.app.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Book userId is null")
    private Long userId;

    @NotNull(message = "Book title is null")
    @Size(min = 1, message = "Length book title must be greater than 2")
    private String title;

    @NotNull(message = "Book author is null")
    @Size(min = 2, message = "Length book author must be greater than 2")
    private String author;


    @Min(value = 0, message = "Book pageCount over 0")
    private long pageCount;


}
