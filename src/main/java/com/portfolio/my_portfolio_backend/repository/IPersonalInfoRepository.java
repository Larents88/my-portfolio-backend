package com.portfolio.my_portfolio_backend.repository;

import com.portfolio.my_portfolio_backend.model.PersonalInfo;

import java.util.List;

public interface IPersonalInfoRepository {
    PersonalInfo save(PersonalInfo personalInfo); //recibe un objeto de tipo PersonalInfo y lo guarda en la base de datos

    PersonalInfo findById(Long id);

    List<PersonalInfo> findAll();

    void deleteById(Long id);
}
