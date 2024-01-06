/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Perlengkapan {
     String nim;
     String namaayah;
     String pekerjaanayah;
     String namaibu;
     String pekerjaanibu;
     String alamat;

    public Perlengkapan() {
    }

    public Perlengkapan(String nim, String namaayah, String pekerjaanayah, String namaibu, String pekerjaanibu, String alamat) {
        this.nim = nim;
        this.namaayah = namaayah;
        this.pekerjaanayah = pekerjaanayah;
        this.namaibu = namaibu;
        this.pekerjaanibu = pekerjaanibu;
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNamaayah() {
        return namaayah;
    }

    public void setNamaayah(String namaayah) {
        this.namaayah = namaayah;
    }

    public String getPekerjaanayah() {
        return pekerjaanayah;
    }

    public void setPekerjaanayah(String pekerjaanayah) {
        this.pekerjaanayah = pekerjaanayah;
    }

    public String getNamaibu() {
        return namaibu;
    }

    public void setNamaibu(String namaibu) {
        this.namaibu = namaibu;
    }

    public String getPekerjaanibu() {
        return pekerjaanibu;
    }

    public void setPekerjaanibu(String pekerjaanibu) {
        this.pekerjaanibu = pekerjaanibu;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
}