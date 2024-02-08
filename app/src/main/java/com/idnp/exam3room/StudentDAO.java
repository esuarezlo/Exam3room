package com.idnp.exam3room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface StudentDAO {
    @Query("select * from student")
    List<Student> getStudents();

    @Insert
    void insert(List<Student> studentsEntity);

    @Delete
    void delete(Student student);
}
