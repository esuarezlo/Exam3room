package com.idnp.exam3room;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UnitDAO {
    @Query("select * from unit")
    List<Unit> getUnits();

    @Insert
    void insert(Unit unit);

}
