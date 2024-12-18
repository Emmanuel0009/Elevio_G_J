package com.elevio.gestion.models.entity;

import java.sql.Timestamp;
import java.util.List;

public class TeacherStudents {
    private Integer id;
    private Employee teacher;
    private Timestamp teacherArrivalTime;
    private Timestamp teacherDepartureTime;
    private List<StudentSubject> studentSubjectList;
}
