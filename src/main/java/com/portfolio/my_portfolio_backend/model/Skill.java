package com.portfolio.my_portfolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    private Long id;
    private String name; // Java, HTML, CSS, JavaScript, etc.
    private String levelPercentage; // 90-95 (barras progreso)
    private String iconClass;
    private Long personalInfoId; //clave foranea a personalInfo
}
