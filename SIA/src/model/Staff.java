/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grego
 */
public class Staff extends User {
    private String nik;

    public Staff(String nama, String alamat, String ttl, String telepon, String nik) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
    }
    
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    
    @Override
    public String toString(){
        return "Staff"
                + "\nnama    : " + getNama()
                + "\nalamat  : " + getAlamat()
                + "\nTTL     : " + getTtl()
                + "\ntelepon : " + getTelepon()
                + "\nNIK     : " + nik;
    }
}
