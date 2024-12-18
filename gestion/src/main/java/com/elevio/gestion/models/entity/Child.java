package com.elevio.gestion.models.entity;

import com.elevio.gestion.utils.enums.SchoolClassEnum;

import java.util.List;

public class Child {
    private Integer id;
    private String lastName;
    private String firstName;
    private SchoolClassEnum schoolClass;
    private Byte[] photo;
    private List<Comment> commentsList;
    private List<ReportCard> reportCardList;
    private List<Guardian> guardianList;
    private ContactInfo contactInfo;
    private Address address;
    private List<Appointment> appointmentList;
    private Payment lastPayment;
    private Plan plan;
    private Guardian sponsor;
}
