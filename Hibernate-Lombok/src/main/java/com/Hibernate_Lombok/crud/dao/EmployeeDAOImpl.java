package com.Hibernate_Lombok.crud.dao;

import com.Hibernate_Lombok.crud.entity.employee;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager= entityManager;
    }


    @Override
    @Transactional
    public void createEmployee(employee theEmployee) {
        entityManager.persist(theEmployee);
    }
}
