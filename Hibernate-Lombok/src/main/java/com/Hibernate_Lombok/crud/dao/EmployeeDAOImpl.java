package com.Hibernate_Lombok.crud.dao;

import com.Hibernate_Lombok.crud.entity.employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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

    @Override
    @Transactional
    public void createMultipleEmployee(employee theEmployee) {
        entityManager.persist(theEmployee);

    }

    @Override
    public employee getEmployeeId(Integer theId) {
        return entityManager.find(employee.class, theId);
    }

    @Override
    @Transactional
    public void updateEmployee(employee theEmployee) {

        entityManager.merge(theEmployee);
    }

    @Override
    @Transactional
    public void deleteEmployee(Integer theId) {

        employee resEmployee = entityManager.find(employee.class, theId);

        entityManager.remove(resEmployee);
    }


}
