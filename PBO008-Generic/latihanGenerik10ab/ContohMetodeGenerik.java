/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanGenerik10ab;

/**
 * Nama File        : ContohMetodeGenerik.java
 * Deskripsi        : Kelas yang berisi metode generik untuk mengakses data
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 1 Mei 2025
 */

public class ContohMetodeGenerik {
    
    // Methods Generic
    public <G> G fungsiAmbilIsi(Datum<G> d){ // function fungsiAmbilIsi<Generik>(d:datum<Generik>) -> Generik
        return d.getIsi();
    }
    
    public <G> void tampilkanInfo(Datum<G> d) { //procedure tampilkanInfo<Generik> (d:Datum<Generik>)
    System.out.println("Isi objek: " + d.getIsi().getClass().getSimpleName());
    }
    
    // Prosedur generik: memproses isi dari Datum (jika tipe G adalah turunan dari Anabu)
    public <G> void prosesIsi(Datum<G> d) {
        G isi = d.getIsi();
        if (isi instanceof Anabul h) {
            h.bersuara();
            h.bergerak();
        } else {
            System.out.println("Isi bukan hewan, tidak dapat diproses.");
        }
    }
}
