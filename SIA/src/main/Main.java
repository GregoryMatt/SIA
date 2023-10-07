/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.ArrayList;
import model.*;
import view.MainMenu;
/**
 *
 * @author grego
 */
public class Main {
    public static void main(String[] args) {
        // Data Dummy
        ArrayList<Matakuliah> listMatakuliah1 = new ArrayList<>();
        listMatakuliah1.add(new Matakuliah("MK001", "3", "Matematika"));
        listMatakuliah1.add(new Matakuliah("MK002", "2", "Bahasa Inggris"));

        ArrayList<Presensi> listPresensi1 = new ArrayList<>();
        listPresensi1.add(new Presensi("2023-09-29", InterfaceStatus.HADIR));
        listPresensi1.add(new Presensi("2023-09-30", InterfaceStatus.ALPHA));

        MatkulAmbil matkulAmbil1 = new MatkulAmbil(listMatakuliah1.get(0), listPresensi1, 10, 20, 30);
        ArrayList <MatkulAmbil> listMatkulAmbil = new ArrayList<>();
        listMatkulAmbil.add(matkulAmbil1);
        
        ArrayList<PresensiStaff> listPresensiStaff1 = new ArrayList<>();
        listPresensiStaff1.add(new PresensiStaff("2023-09-29", InterfaceStatus.HADIR, 8));

        MatkulAjar matkulAjar1 = new MatkulAjar(listMatakuliah1.get(1), listPresensiStaff1);

        Sarjana sarjana1 = new Sarjana("John", "Jalan ABC No. 123", "01-01-1990", "1234567890", "123456789", "Teknik Informatika", listMatkulAmbil);
        Magister magister1 = new Magister("Alice", "Jalan XYZ No. 456", "02-02-1995", "9876543210", "987654321", "Ilmu Komputer", listMatkulAmbil, "Judul Penelitian Magister");
        Doktor doktor1 = new Doktor("Bob", "Jalan PQR No. 789", "03-03-2000", "5555555555", "555555555", "Fisika", "Judul Penelitian Doktor", 90.0, 85.0, 88.0);

        ArrayList<PresensiStaff> listPresensiStaff2 = new ArrayList<>();
        listPresensiStaff2.add(new PresensiStaff("2023-09-29", InterfaceStatus.HADIR, 9));
        listPresensiStaff2.add(new PresensiStaff("2023-09-30", InterfaceStatus.ALPHA, 8));

        Karyawan karyawan1 = new Karyawan("Eve", "Jalan LMN No. 101", "04-04-1998", "1231231234", "123123123", 2000.0, listPresensiStaff2);

        ArrayList<Matakuliah> listMatakuliah2 = new ArrayList<>();
        listMatakuliah2.add(new Matakuliah("MK003", "3", "Fisika Dasar"));
        listMatakuliah2.add(new Matakuliah("MK004", "2", "Kimia Dasar"));

        ArrayList<PresensiStaff> listPresensiStaff3 = new ArrayList<>();
        listPresensiStaff3.add(new PresensiStaff("2023-09-29", InterfaceStatus.HADIR, 7));
        listPresensiStaff3.add(new PresensiStaff("2023-09-30", InterfaceStatus.HADIR, 6));

        Dosen dosen1 = new Dosen("David", "Jalan OPQ No. 202", "05-05-1997", "9998887777", "999888777", "Fisika", listMatakuliah2);
        DTetap dTetap1 = new DTetap("Frank", "Jalan RST No. 303", "06-06-1996", "7778889999", "777888999", "Kimia", listMatakuliah2, 2500.0);
        DHonorer dHonorer1 = new DHonorer("Grace", "Jalan UVW No. 404", "07-07-1994", "8887776666", "888777666", "Biologi", listMatakuliah2, 150.0);

        ArrayList<User> listUser = new ArrayList<>();
        listUser.add(sarjana1);
        listUser.add(magister1);
        listUser.add(doktor1);
        listUser.add(dosen1);
        listUser.add(karyawan1);
        listUser.add(dTetap1);
        listUser.add(dHonorer1);
        
        // Menampilkan Data Dummy
        System.out.println("Data Mahasiswa Sarjana:");
        System.out.println(sarjana1.toString());

        System.out.println("\nData Mahasiswa Magister:");
        System.out.println(magister1.toString());

        System.out.println("\nData Mahasiswa Doktor:");
        System.out.println(doktor1.toString());

        System.out.println("\nData Karyawan:");
        System.out.println(karyawan1.toString());

        System.out.println("\nData Dosen:");
        System.out.println(dosen1.toString());

        System.out.println("\nData Dosen Tetap:");
        System.out.println(dTetap1.toString());

        System.out.println("\nData Dosen Honorer:");
        System.out.println(dHonorer1.toString());

        System.out.println("\nData Matkul Ambil:");
        System.out.println(matkulAmbil1.toString());

        System.out.println("\nData Matkul Ajar:");
        System.out.println(matkulAjar1.toString());
        
        new MainMenu(listUser);
    }
}
