package com.elevio.gestion.models.entity;

import com.elevio.gestion.utils.enums.CheckTypeEnum;

import java.sql.Timestamp;

public class Check {
    private Integer id;
    private Float amount;
    private String checkNumber;
    private String bankName;
    private Timestamp expectedDepositDate;
    private Byte[] checkFile;
    private CheckTypeEnum checkType;
}
