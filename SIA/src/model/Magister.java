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
public class Magister extends Mahasiswa{
    
    private ArrayList <MatkulAmbil> listMatakuliah = new ArrayList <MatkulAmbil>();
    private String judulPenelitian;
    
    public Magister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, ArrayList listMatakuliah, String judulPenelitian){
        super(nama, alamat, ttl, telepon, nim, jurusan);
        
        this.listMatakuliah = listMatakuliah;
        this.judulPenelitian = judulPenelitian;
    }
    
    public ArrayList<MatkulAmbil> getListMatakuliah() {
        return listMatakuliah;
    }

    public void setListMatakuliah(ArrayList<MatkulAmbil> listMatakuliah) {
        this.listMatakuliah = listMatakuliah;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
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
                + "\nlist Matakuliah  : " + listMatakuliah
                + "\njudul penelitian : " + judulPenelitian;
    }
    
}
