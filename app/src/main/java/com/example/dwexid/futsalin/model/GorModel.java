package com.example.dwexid.futsalin.model;

public class GorModel {


        private String namaGor;
        private String alamat;

    public GorModel(String namaGor, String alamat) {
        this.namaGor = namaGor;
        this.alamat = alamat;
    }

    public String getNamaGor() {
        return namaGor;
    }

    public void setNamaGor(String namaGor) {
        this.namaGor = namaGor;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
