package com.example.galeribuahtropis.Model;

public class Buah {
    private String warna;
    private String nama;
    private String jenis;
    private String deskripsi;
    private int drawableRes;

    public Buah (String warna, String nama, String jenis, String deskripsi, int drawableRes) {
        this.warna = warna;
        this.nama = nama;
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
}
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}