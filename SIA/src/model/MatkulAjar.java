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
public class MatkulAjar {
    private Matakuliah matkul;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public MatkulAjar(Matakuliah matkul, ArrayList<PresensiStaff> listPresensiStaff) {
        this.matkul = matkul;
        this.listPresensiStaff = listPresensiStaff;
    }

    public Matakuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(Matakuliah matkul) {
        this.matkul = matkul;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }
    
    @Override
    public String toString() {
        return "MatkulAmbil" 
                + "\nmatkul : " + matkul 
                + "\nlistPresensi : " + listPresensiStaff;
    }
    
}
