package com.idnp.exam3room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(version = 1,
        entities = {
                Student.class,
                Unit.class
        }
)
abstract class AppDatabase extends RoomDatabase {
    public abstract StudentDAO StudentDAO();

    public abstract UnitDAO UnitDAO();

    private static AppDatabase INSTANCE = null;

    static AppDatabase getInstance(Context context) {
        synchronized (context) {
            AppDatabase instance = INSTANCE;

            if (instance == null) {
                instance = Room.databaseBuilder(
                                context,
                                AppDatabase.class,
                                "database-name"
                        ).fallbackToDestructiveMigration()
                        .build();

                INSTANCE = instance;

            }

            return instance;
        }
    }
}
