/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsAnabul;

/**
 * Nama File        : MainKoleksiAnabul.java
 * Deskripsi        : Aplikasi Koleksi generik berisi 10 Anabul acak
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 11 Mei 2025
 */
import java.util.Random;

public class MainKoleksiAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksi = new Koleksi<>();
        Random rnd = new Random();

        // generate 10 elemen acak
        for (int i = 1; i < 11; i++) {
            int jenis = rnd.nextInt(3);
            switch (jenis) {
                case 0: koleksi.add(new Kucing("Kucing" + i, "Warna" + i)); break;
                case 1: koleksi.add(new Anjing("Anjing" + i, "Ras" + i));    break;
                default: koleksi.add(new Burung("Burung" + i, 10 + i));      break;
            }
        }

        // tampilkan nama, suara, dan gerakan
        System.out.println("=== Koleksi Anabul ===");
        koleksi.showAll();  // memanfaatkan overridden toString() di tiap subclass
        System.out.println("\n=== Aksi Anabul ===");
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul a = koleksi.getIsi(i);
            System.out.printf("%s: ", a.getNama());
            a.bersuara();
            a.bergerak();
        }
    }
}

