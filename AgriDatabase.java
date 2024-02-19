package com.example.agriculturalautomationsystemapp;
import android.content.Context;
import androidx.room.Entity;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Owner.class}, version = 1)
public abstract class AgriDatabase extends RoomDatabase{
public abstract OwnerDAO getOwnerDAO();
private static AgriDatabase ourInstance;
public static AgriDatabase getInstance(Context context){
    if(ourInstance==null){
        ourInstance = Room.databaseBuilder(context,AgriDatabase.class,"owners.db")
                .createFromAsset("database/owners.db")
                .allowMainThreadQueries().build();
    }
    return  ourInstance;
}
}
