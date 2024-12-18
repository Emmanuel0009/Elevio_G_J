package com.elevio.gestion.models.entity;

import com.elevio.gestion.utils.enums.AppointmentTypeEnum;

import java.sql.Timestamp;

public class Appointment {
    private Integer id;
    private Timestamp dateAppointment;
    private AppointmentTypeEnum appointmentType;
    private String comment;
}
