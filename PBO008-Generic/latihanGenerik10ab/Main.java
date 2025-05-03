/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanGenerik10ab;

/**
 * Nama File        : Main.java
 * Deskripsi        : Program utama yang mensimulasikan semua bunyi dan gerakan setiap tipe anabul beserta testing dari fungi dan prosedur generic
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 1 Mei 2025
 */


public class Main {
    public static void main(String[] args) {
        // Instansiasi objek generik dan kelas utilitas
        Datum<Anabul> anu = new Datum<>();
        ContohMetodeGenerik alatUji = new ContohMetodeGenerik();

        // implementasi
        System.out.println("==== Anabul 1: Anjing ====");
        anu.setIsi(new Anjing("BullDog"));
        alatUji.fungsiAmbilIsi(anu).bergerak();
        alatUji.tampilkanInfo(anu);
        alatUji.prosesIsi(anu);

        System.out.println("\n==== Anabul 2: Burung ====");
        anu.setIsi(new Burung("Kenari"));
        alatUji.fungsiAmbilIsi(anu).bersuara();
        alatUji.tampilkanInfo(anu);
        alatUji.prosesIsi(anu);

        System.out.println("\n==== Anabul 3: Kucing ====");
        anu.setIsi(new Kucing("Persia"));
        alatUji.fungsiAmbilIsi(anu).bergerak();
        alatUji.tampilkanInfo(anu);
        alatUji.prosesIsi(anu);
        
        
        // doneeeee
    }
}
