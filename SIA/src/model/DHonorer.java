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
public class DHonorer extends Dosen{
    private double honorPerSKS;
    
    public DHonorer(String nama, String alamat, String ttl, String telepon, String nik, String departemen, ArrayList <Matakuliah> listMatakuliah, double honorPerSkS){
        super(nama, alamat, ttl, telepon, nik, departemen, listMatakuliah);
        
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }
    
    @Override
    public String toString(){
        return "Staff"
                + "\nnama    : " + getNama()
                + "\nalamat  : " + getAlamat()
                + "\nTTL     : " + getTtl()
                + "\ntelepon : " + getTelepon()
                + "\nNIK     : " + getNik()
                + "\ndepartemen : " + getDepartemen()
                + "\nlist matakuliah : " + getListMatakuliah()
                + "\nhonor per sks : " + honorPerSKS;
    }
    
}
