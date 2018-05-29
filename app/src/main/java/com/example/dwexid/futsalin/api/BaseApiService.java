package com.example.dwexid.futsalin.api;

import com.example.dwexid.futsalin.model.ResponseGorModel;

import retrofit2.Call;
import retrofit2.http.POST;

public interface BaseApiService {

    @POST("/gor/")
    Call<ResponseGorModel> getGorList();

}

