package com.elevio.gestion.models.entity;

import com.elevio.gestion.utils.enums.PaymentModeEnum;

public class BankInfo {
    private Integer id;
    private String rib;
    private String bankName;
    private Deposit deposit;
    private PaymentModeEnum paymentMethod;
}
