/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author grego
 */
public class PrintKelulusan {
    public PrintKelulusan(ArrayList <User> listUser){
        print(listUser);
    }
    
    public void print(ArrayList <User> listUser){
        String kode = JOptionPane.showInputDialog(null, "Masukkan Kode Mata Kuliah : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        Controller hitung = new Controller();
        int[] hasil = hitung.HitungMH(kode);
        JOptionPane.showMessageDialog(null, "Jumlah mahasiswa yang tidak lulus : "+hasil[0]+"\nJumlah mahasiswa yang mengambil mata kuliah : "+hasil[1], "Data : ", JOptionPane.INFORMATION_MESSAGE);
    }
}
