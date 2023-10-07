/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author grego
 */
public class MainMenu {

    public MainMenu(ArrayList<User> listUser) {
        showMainMenu(listUser);
    }

    private void showMainMenu(ArrayList<User> listUser) {
        boolean exit = true;
        while (exit) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: \n1. Print User Data \n2. Print Nilai Akhir \n3. Print Rata-Rata Nilai Akhir Seluruh Mahasiswa\n4. Print Mahasiswa tidak lulus matkul\n5. Print Matkul Ambil untuk Mahasiswa\n6. Print Jam Dosen Mengajar\n7. Print Gaji Staff\n8. Exit"));
            switch (choosen) {
                case 1:
                    new PrintUser(listUser);
                    break;
                case 2:
                    new PrintNA(listUser);
                    break;
                case 3:
                    new PrintNR();
                    break;
                case 4:
                    new PrintKelulusan();
                    break;
                case 5:
                    new PrintMatkulAmbil();
                    break;
                case 6:
                    new PrintTotalNgajar();
                    break;
                case 7:
                    new PrintGajiStaff();
                    break;
                case 8:
                    exit = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Input Error", "", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}
