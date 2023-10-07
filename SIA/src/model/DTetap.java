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
public class DTetap extends Dosen{
    private double salary;
    
    public DTetap(String nama, String alamat, String ttl, String telepon, String nik, String departemen, ArrayList <Matakuliah> listMatakuliah, double salary){
        super(nama, alamat, ttl, telepon, nik, departemen, listMatakuliah);
        
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
                + "\nsalary : " + salary;
    }
    
}
