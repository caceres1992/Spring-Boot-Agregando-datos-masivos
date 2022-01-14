package com.example.excelimportexport.model;

import lombok.Data;

import javax.persistence.*;

@Table
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String lastName;
    private String dni;
}
