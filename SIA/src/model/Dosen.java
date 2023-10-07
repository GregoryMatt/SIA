/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author grego
 */
public class Dosen extends Staff {
    private String departemen;
    private ArrayList <Matakuliah> listMatakuliah = new ArrayList <Matakuliah>();
    
    public Dosen(String nama, String alamat, String ttl, String telepon, String nik, String departemen, ArrayList <Matakuliah> listMatakuliah){
        super(nama, alamat, ttl, telepon, nik);
        
        this.departemen = departemen;
        this.listMatakuliah = listMatakuliah;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<Matakuliah> getListMatakuliah() {
        return listMatakuliah;
    }

    public void setListMatakuliah(ArrayList<Matakuliah> listMatakuliah) {
        this.listMatakuliah = listMatakuliah;
    }

    @Override
    public String toString(){
        return "Staff"
                + "\nnama    : " + getNama()
                + "\nalamat  : " + getAlamat()
                + "\nTTL     : " + getTtl()
                + "\ntelepon : " + getTelepon()
                + "\nNIK     : " + getNik()
                + "\ndepartemen : " + departemen
                + "\nlist matakuliah : " + listMatakuliah;
    }
    
    
    
}
