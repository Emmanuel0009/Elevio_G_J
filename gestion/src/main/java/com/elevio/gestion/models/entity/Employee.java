package com.elevio.gestion.models.entity;

import com.elevio.gestion.utils.enums.RoleEnum;

import java.sql.Timestamp;
import java.util.List;

public class Employee {
    private Integer id;
    private String lastName;
    private String firstName;
    private Timestamp dateOfBirth;
    private List<RoleEnum> roles;
    private List<Expertise> expertiseList;
    private ContactInfo contactInfo;
    private Address address;
    private Education education;
    private List<Session> sessionList;
    private HourlyRate hourlyRate;
    private List<Comment> comments;
}
