package com.example.digital.room.dao.database;
import android.arch.persistence.room.Room;
import android.content.Context;

public class DatabaseHelper {
        private static final String DB_NAME = "database-name.db";
        private static MyDatabase db;

        public static MyDatabase getInstance(Context applicationContext){
            if (db == null){
                db = Room.databaseBuilder(applicationContext,
                        MyDatabase.class, DB_NAME).allowMainThreadQueries().build();
            }
            return db;
        }

}
