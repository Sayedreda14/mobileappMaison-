package com.example.agriculturalautomationsystemapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "owners")
public class Owner {

    @PrimaryKey(autoGenerate = true)
    public int ID;
    public String owner_name,email,passcode;
}
