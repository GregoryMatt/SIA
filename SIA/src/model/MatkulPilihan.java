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
public class MatkulPilihan extends Matakuliah{
    private int jumlahMinMahasiswa;
    
    public MatkulPilihan(String kode, String sks, String nama, int jumlahMinMahasiswa){
        super(kode, sks, nama);
        
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    public int getJumlahMinMahasiswa() {
        return jumlahMinMahasiswa;
    }

    public void setJumlahMinMahasiswa(int jumlahMinMahasiswa) {
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }
    
    @Override
    public String toString() {
        return "Matakuliah" 
                + "\nkode : " + getKode() 
                + "\nsks  : " + getSks() 
                + "\nnama : " + getNama()
                + "\nJumlah min Mahasiswa : " + jumlahMinMahasiswa;
    }
    
}
