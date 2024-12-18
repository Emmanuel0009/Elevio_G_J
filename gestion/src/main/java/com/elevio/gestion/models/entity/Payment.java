package com.elevio.gestion.models.entity;

import com.elevio.gestion.utils.enums.PaymentModeEnum;

import java.sql.Timestamp;

public class Payment {
    private Integer id;
    private Timestamp paymentDate;
    private String paidPeriod;
    private PaymentModeEnum paymentMethod;
    private Check check;
    private DirectDebit directDebit;
}
