package com.example.agriculturalautomationsystemapp;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface OwnerDAO {
    @Query("SELECT owner_name from owners")
    List<String> selectOwner();
    @Query("SELECT passcode from owners")
    List<String> selectPasscode();
    @Query("SELECT email from owners")
    List<String> selectEmail();


}
