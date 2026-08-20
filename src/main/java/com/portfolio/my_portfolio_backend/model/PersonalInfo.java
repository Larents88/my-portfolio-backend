package com.portfolio.my_portfolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalInfo {
    private Long id; //clave primaria
    private String firstName;
    private String lastName;
    private String title; // "Software Engineer"
    private String profileDescription; // "I am a software engineer"
    private String profileImageUrl; //imagen de perfil
    private Integer yearsOfExperience;
    private String email;
    private String phone;
    private String linkedinUrl;
    private String githubUrl;
}
