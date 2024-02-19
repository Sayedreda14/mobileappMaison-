package com.example.agriculturalautomationsystemapp;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

    public interface ApiService {
        @GET("allowners")
        Call<String> getAllOwners();
        @FormUrlEncoded
        @POST("addnewowner")
        Call<String> addNewOwner(
                @Field("owner_name") String ownerName,
                @Field("email") String email,
                @Field("passcode") String passcode
        );
    }


