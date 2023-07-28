package com.example.explorewisataslemanapp;

public class WisatacandiModel {
    private String tvnamawisata,tvjam,tvdeskripsi,tvalamat;
    private Integer gmbrwisata;

    public WisatacandiModel(String tvnamawisata, String tvjam, String tvdeskripsi, String tvalamat, Integer gmbrwisata) {
        this.tvnamawisata = tvnamawisata;
        this.tvjam = tvjam;
        this.tvdeskripsi = tvdeskripsi;
        this.tvalamat = tvalamat;
        this.gmbrwisata = gmbrwisata;
    }

    public String getTvnamawisata() {
        return tvnamawisata;
    }

    public void setTvnamawisata(String tvnamawisata) {
        this.tvnamawisata = tvnamawisata;
    }

    public String getTvjam() {
        return tvjam;
    }

    public void setTvjam(String tvjam) {
        this.tvjam = tvjam;
    }

    public String getTvdeskripsi() {
        return tvdeskripsi;
    }

    public void setTvdeskripsi(String tvdeskripsi) {
        this.tvdeskripsi = tvdeskripsi;
    }

    public String getTvalamat() {
        return tvalamat;
    }

    public void setTvalamat(String tvalamat) {
        this.tvalamat = tvalamat;
    }

    public Integer getGmbrwisata() {
        return gmbrwisata;
    }

    public void setGmbrwisata(Integer gmbrwisata) {
        this.gmbrwisata = gmbrwisata;
    }
}
