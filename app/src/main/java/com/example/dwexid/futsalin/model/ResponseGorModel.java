package com.example.dwexid.futsalin.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseGorModel {

    @SerializedName("data")
    private List<GorModel> gorList;

    @SerializedName("status")
    private String status;

    public void setGorList(List<GorModel> gorList){
        this.gorList = gorList;
    }

    public List<GorModel> getGorList(){
        return gorList;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
