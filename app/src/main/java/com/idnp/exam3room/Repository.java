package com.idnp.exam3room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import java.util.List;

public class Repository {
    private AppDatabase appDatabase;

    public Repository(AppDatabase appDatabase) {
        this.appDatabase = appDatabase;
    }

    public List<Student> getStudents() {
        return appDatabase.StudentDAO().getStudents();
    }

    public List<Unit> getUnits() {
        return appDatabase.UnitDAO().getUnits();
    }

    public void InsertUnit(Unit unit) {
        appDatabase.UnitDAO().insert(unit);
    }


}
