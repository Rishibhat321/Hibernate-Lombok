package com.Hibernate_Lombok.crud.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "employee_tracker")
public class employee {

    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "mobile")
    private double mobile;

    public employee(String firstName, String lastName, String email, String gender, double mobile) {
        this.firstName= firstName;
        this.lastName=lastName;
        this.email=email;
        this.gender=gender;
        this.mobile=mobile;

    }

}
