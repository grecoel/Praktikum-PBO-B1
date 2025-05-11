/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 * Nama File        : Main.java
 * Deskripsi        : Aplikasi penggunaan Koleksi<T> dengan 10 karakter
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 11 Mei 2025
 */
public class Main {
    public static void main(String[] args) {
        Koleksi<Character> List = new Koleksi<>();

        // Menambahkan 10 karakter A-J
        for (char c = 'A'; c <= 'J'; c++) {
            List.add(c);
        }

        System.out.println("Isi koleksi:");
        List.showAll();

        // Menghapus elemen terakhir
        Character e = List.delete();
        System.out.println("\nElemen terakhir yang dihapus: " + e);

        // Menampilkan isi koleksi setelah penghapusan
        System.out.println("\nIsi koleksi setelah delete:");
        List.showAll();
    }
}

