/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author ACER
 */

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        try {
            MysqlMahasiswaService service = new MysqlMahasiswaService();

            // Insert Nina
            service.insert(new Mahasiswa(1, "Nina"));
            // Insert Rudi and Beni
            service.insert(new Mahasiswa(2, "Rudi"));
            service.insert(new Mahasiswa(3, "Beni"));

            // Display all mahasiswa
            System.out.println("Data Mahasiswa:");
            List<Mahasiswa> list = service.getAll();
            for (Mahasiswa m : list) {
                System.out.println(m);
            }

            // Update Rudi to Agus
            service.update(2, "Agus");

            // Delete Beni
            service.delete(3);

            // Display final data
            System.out.println("\nSetelah Update dan Delete:");
            list = service.getAll();
            for (Mahasiswa m : list) {
                System.out.println(m);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

