package com.elevio.gestion.models.entity;

import java.sql.Timestamp;
import java.util.List;

public class Session {
    private Integer id;
    private Timestamp startTime;
    private Integer durationMinute;
    private List<TeacherStudents> teacherStudentsList;
    private List<Employee> secretaries;
    private Timestamp secretaryArrivalTime;
    private Timestamp secretaryDepartureTime;
}
