/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Administrasi {
    String Nim;
    String Golongan;
    String MetodePembayaran;

    public Administrasi() {
    }

    public Administrasi(String Nim, String Golongan, String MetodePembayaran) {
        this.Nim = Nim;
        this.Golongan = Golongan;
        this.MetodePembayaran = MetodePembayaran;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getGolongan() {
        return Golongan;
    }

    public void setGolongan(String Golongan) {
        this.Golongan = Golongan;
    }

    public String getMetodePembayaran() {
        return MetodePembayaran;
    }

    public void setMetodePembayaran(String MetodePembayaran) {
        this.MetodePembayaran = MetodePembayaran;
    }
    
    
    
}
