package com.idnp.exam3room;

import androidx.room.Entity;


public class Student {
    public String studentId;

    public String nombres;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
