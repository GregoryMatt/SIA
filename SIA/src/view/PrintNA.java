/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import model.User;
import controller.Controller;
import javax.swing.JOptionPane;
/**
 *
 * @author grego
 */
public class PrintNA {
    public PrintNA(ArrayList <User> listUser){
        print(listUser);
    }
    
    public void print(ArrayList <User> listUser){
        String nim = JOptionPane.showInputDialog(null, "Masukkan NIM : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan Kode Mata Kuliah : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        Controller hitung = new Controller();
        JOptionPane.showMessageDialog(null, "Nilai Akhir : "+hitung.hitungNA(nim, kodeMK, listUser), "Data : ", JOptionPane.INFORMATION_MESSAGE);
    }
}
