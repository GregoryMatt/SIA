/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import javax.swing.JOptionPane;
import controller.Controller;
import java.util.ArrayList;
import model.User;
/**
 *
 * @author grego
 */
public class PrintUser {
    public PrintUser(ArrayList <User> listUser){
        print(listUser);
    }
    
    public void print(ArrayList <User> listUser){
        String nama = JOptionPane.showInputDialog(null, "Masukkan nama : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        Controller find = new Controller();
        
        JOptionPane.showMessageDialog(null, find.dataUser(nama, listUser), "Data : ", JOptionPane.INFORMATION_MESSAGE);
    }
}
