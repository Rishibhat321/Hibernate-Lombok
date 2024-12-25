package com.Hibernate_Lombok.crud.dao;

import com.Hibernate_Lombok.crud.entity.employee;

import java.util.List;

public interface EmployeeDAO {

    void createEmployee(employee theEmployee);

    void createMultipleEmployee(employee theEmployee);

    employee getEmployeeId(Integer theId);

    void updateEmployee(employee theEmployee);

    void deleteEmployee(Integer theId);


}
