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
public class MatkulAmbil{
    private Matakuliah matkul;
    private ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(Matakuliah matkul, ArrayList listPresensi, int n1, int n2, int n3) {
        this.matkul = matkul;
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Matakuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(Matakuliah matkul) {
        this.matkul = matkul;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MatkulAmbil" 
                + "\nmatkul : " + matkul 
                + "\nlistPresensi : " + listPresensi 
                + "\nn1 : " + n1 
                + "\nn2 : " + n2 
                + "\nn3 : " + n3;
    }
    
    
    
}
