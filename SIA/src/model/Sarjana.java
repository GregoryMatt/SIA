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
public class Sarjana extends Mahasiswa{
    private ArrayList <MatkulAmbil> listMatakuliah = new ArrayList <MatkulAmbil>();
    
    public Sarjana (String nama, String alamat, String ttl, String telepon, String nim, String jurusan, ArrayList listMatakuliah){
        super(nama, alamat, ttl, telepon, nim, jurusan);
        
        this.listMatakuliah = listMatakuliah;
    }
    
    public ArrayList<MatkulAmbil> getListMatakuliah() {
        return listMatakuliah;
    }

    public void setListMatakuliah(ArrayList<MatkulAmbil> listMatakuliah) {
        this.listMatakuliah = listMatakuliah;
    }

    @Override
    public String toString() {
        return "Sarjana" 
                + "\nnama    : " + getNama()
                + "\nalamat  : " + getAlamat()
                + "\nTTL     : " + getTtl()
                + "\ntelepon : " + getTelepon()
                + "\nNIM     : " + getNim()
                + "\nJurusan : " + getJurusan()
                + "\nlistMatakuliah : " + listMatakuliah;
    }
}
