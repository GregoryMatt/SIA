/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.*;
import main.Main;

/**
 *
 * @author grego
 */
public class Controller {

    public String dataUser(String nama, ArrayList<User> listUser) {
        String temp = "";
        for (User user : listUser) {
            if (user.getNama().equalsIgnoreCase(nama)) {
                temp += user.toString();
                if (user instanceof Doktor) {
                    temp += "Status = Mahasiswa Doktor";
                } else if (user instanceof Magister) {
                    temp += "Status = Mahasiswa Magister";
                } else if (user instanceof Sarjana) {
                    temp += "Status = Mahasiswa Sarjana";
                } else if (user instanceof DHonorer) {
                    temp += "Status = Dosen Honorer";
                } else if (user instanceof DTetap) {
                    temp += "Status = Dosen Tetap";
                } else {
                    temp += "Status = Karyawan";
                }
            }
        }
        return temp;
    }

    public double hitungNA(String nim, String kodeMK, ArrayList<User> listUser) {
        for (int i = 0; i < listUser.size(); i++) {
            Mahasiswa mahasiswa = (Mahasiswa) listUser.get(i);
            if (mahasiswa.getNim().equals(nim) && listUser.get(i) instanceof Mahasiswa) {
                if (mahasiswa instanceof Doktor) {
                    Doktor doktor = (Doktor) listUser.get(i);
                    double nilai = doktor.getNilai1();
                    nilai += doktor.getNilai2();
                    nilai += doktor.getNilai3();
                    nilai = nilai / 3;
                    return nilai;
                } else if (mahasiswa instanceof Magister) {
                    Magister magister = (Magister) listUser.get(i);
                    for (int j = 0; j < magister.getListMatakuliah().size(); j++) {
                        if (magister.getListMatakuliah().get(j).getMatkul().getKode().equals(kodeMK)) {
                            double nilai = magister.getListMatakuliah().get(j).getN1();
                            nilai += magister.getListMatakuliah().get(j).getN2();
                            nilai += magister.getListMatakuliah().get(j).getN3();
                            nilai = nilai / 3;
                            return nilai;
                        }
                    }
                } else if (mahasiswa instanceof Sarjana) {
                    Sarjana sarjana = (Sarjana) listUser.get(i);
                    for (int j = 0; j < sarjana.getListMatakuliah().size(); j++) {
                        if (sarjana.getListMatakuliah().get(j).getMatkul().getKode().equals(kodeMK)) {
                            float nilai = sarjana.getListMatakuliah().get(j).getN1();
                            nilai += sarjana.getListMatakuliah().get(j).getN2();
                            nilai += sarjana.getListMatakuliah().get(j).getN3();
                            nilai = nilai / 3;
                            return nilai;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public double hitungNR(String kode, ArrayList<User> listUser) {
        double total = 0;

        int count = 0;
        for (User mhs : listUser) {
            float nr = 0;
            if (mhs instanceof Mahasiswa) {
                Mahasiswa mhs1 = (Mahasiswa) mhs;
                if (mhs1 instanceof Magister) {
                    count++;
                    Magister mhs2 = (Magister) mhs1;
                    for (MatkulAmbil mk : mhs2.getListMatakuliah()) {
                        if (mk.getMatkul().getKode().equals(kode)) {
                            nr += mk.getN1();
                            nr += mk.getN2();
                            nr += mk.getN3();
                            total += nr / 3;
                        }
                    }
                } else if (mhs1 instanceof Sarjana) {
                    count++;
                    Sarjana mhs2 = (Sarjana) mhs1;
                    for (MatkulAmbil mk : mhs2.getListMatakuliah()) {
                        if (mk.getMatkul().getKode().equals(kode)) {
                            nr += mk.getN1();
                            nr += mk.getN2();
                            nr += mk.getN3();
                            total += nr / 3;
                        }
                    }
                }
            }
        }
        return total / count;
    }
    
    public int[] hitungMH(String kodeMK, ArrayList <User> listUser) {
        int countTidakLulus = 0;
        int total = 0;
        for (model.User mhs : listUser) {
            if (mhs instanceof model.Mahasiswa) {
                model.Mahasiswa mhs1 = (model.Mahasiswa) mhs;
                if (mhs1 instanceof Magister) {
                    Magister mhs2 = (Magister) mhs1;
                    for (MatkulAmbil mk : mhs2.getListMatakuliah()) {
                        if (mk.getMatkul().getKode().equals(kodeMK)) {
                            total++;
                            
                            if (hitungNA(mhs1.getNim(), kodeMK, listUser) < 56) {
                                countTidakLulus++;
                            }
                        }
                    }
                } else if (mhs1 instanceof Sarjana) {
                   Sarjana mhs2 = (Sarjana) mhs1;
                    for (MatkulAmbil mk : mhs2.getListMatakuliah()) {
                        if (mk.getMatkul().getKode().equals(kodeMK)) {
                            total++;
                            
                            if (hitungNA(mhs1.getNim(), kodeMK, listUser) < 56) {
                                countTidakLulus++;
                            }
                        }
                    }
                }
            }
        }
        return new int[] { countTidakLulus, total };
    }
}
