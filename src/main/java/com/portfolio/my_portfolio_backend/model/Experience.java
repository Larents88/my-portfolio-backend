package com.portfolio.my_portfolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    private Long id;
    private String jobTitle; // "Software Engineer"
    private String companyName;
    private LocalDate startDate;
    private LocalDate endDate; // puede ser null si es el puesto actual
    private String description; //responsabilidades y logros
    private Long personalInfoId; //clave foranea a personalInfo
}
