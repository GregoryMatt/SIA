/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grego
 */
public class Doktor extends Mahasiswa{
    private String judulPenelitian;
    private double nilai1;
    private double nilai2;
    private double nilai3;
    
    public Doktor(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, String judulPenelitian, double nilai1, double nilai2, double nilai3){
        super(nama, alamat, ttl, telepon, nim, jurusan);
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    public double getNilai1() {
        return nilai1;
    }

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public double getNilai3() {
        return nilai3;
    }

    public void setNilai3(double nilai3) {
        this.nilai3 = nilai3;
    }
    
    @Override
    public String toString() {
        return "Magister" 
                + "\nnama    : " + getNama()
                + "\nalamat  : " + getAlamat()
                + "\nTTL     : " + getTtl()
                + "\ntelepon : " + getTelepon()
                + "\nNIM     : " + getNim()
                + "\nJurusan : " + getJurusan()
                + "\njudul penelitian : " + judulPenelitian
                + "\nnilai 1 : " + nilai1
                + "\nnilai 2 : " + nilai2
                + "\nnilai 3 : " + nilai3;
    }
    
}
