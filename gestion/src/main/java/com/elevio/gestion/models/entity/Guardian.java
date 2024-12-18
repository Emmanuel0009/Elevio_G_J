package com.elevio.gestion.models.entity;

import com.elevio.gestion.utils.enums.ClientStatus;
import com.elevio.gestion.utils.enums.GuardianTypeEnum;
import com.elevio.gestion.utils.enums.RoleEnum;

import javax.naming.CommunicationException;
import java.util.List;

public class Guardian {
    private Integer id;
    private String lastName;
    private String firstName;
    private ContactInfo contactInfo;
    private Address address;
    private Appointment appointment;
    private ClientStatus clientStatus;
    private RoleEnum role;
    private GuardianTypeEnum guardianType;
    private List<Child> childrenList;
    private List<Payment> paymentList;
    private List<Child> sponsoredChildrenList;
    private List<Comment> commentList;
}
