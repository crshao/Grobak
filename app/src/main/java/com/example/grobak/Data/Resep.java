package com.example.grobak.Data;

public class Resep {

    public String nama;
    public String detail;
    public int image;
    public String url;
    public String bahan;
    public String[] nut;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String[] getNut() {
        return nut;
    }

    public void setNut(String[] nut) {
        this.nut = nut;
    }
}
