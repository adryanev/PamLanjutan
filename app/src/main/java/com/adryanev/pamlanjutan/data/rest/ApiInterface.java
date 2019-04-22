package com.adryanev.pamlanjutan.data.rest;

import com.adryanev.pamlanjutan.data.rest.responses.LoginResponse;
import com.adryanev.pamlanjutan.data.rest.responses.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("user/register")
    Call<RegisterResponse> registerUser(
            @Field("username") String username,
            @Field("password") String password,
            @Field("nama") String nama,
            @Field("email") String email,
            @Field("nomor_hp") String nomorHp
    );

    @POST("user/login")
    Call<LoginResponse> loginUser(
            @Field("username") String username,
            @Field("password") String password
    );
}
