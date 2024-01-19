package com.example.securitymasterdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @Size(min = 2,max = 5,
    message = "code must have length 2 -5 characters.")
    private String code;
    @NotBlank(message = "Name cannot be empty!")
    @Pattern(regexp = "[A-Za-z-']*",
            message = "Name cannot contain illegal characters.")
    private String name;
    @NotBlank(message = "Country cannot be empty!")
    @Pattern(regexp = "[A-Za-z-']*",
            message = "country cannot contain illegal characters.")
    private String country;

}