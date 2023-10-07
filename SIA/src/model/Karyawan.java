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
public class Karyawan extends Staff{
    private double salary;
    private ArrayList <PresensiStaff> presensiStaff = new ArrayList <PresensiStaff>();
    
    public Karyawan(String nama, String alamat, String ttl, String telepon, String nik, double salary, ArrayList presensiStaff){
        super(nama, alamat, ttl, telepon, nik); 
        
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }
    
    @Override
    public String toString(){
        return "Staff"
                + "\nnama    : " + getNama()
                + "\nalamat  : " + getAlamat()
                + "\nTTL     : " + getTtl()
                + "\ntelepon : " + getTelepon()
                + "\nNIK     : " + getNik()
                + "\nsalary : " + salary
                + "\npresensi staff : " + presensiStaff;
    }
    
}
