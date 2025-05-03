/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanGenerik10ab;

/**
 * Nama File        : Anjing.java
 * Deskripsi        : Kelas turunan dari Anabul yang merepresentasikan Anjing
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 26 April 2025
 */

 public class Anjing extends Anabul {
    // Atribut khusus untuk Anjing
    private String ras;
    
    // Konstruktor
    public Anjing(String nama) {
        super(nama);
        this.ras = "Tidak diketahui"; 
    }
    
    public Anjing(String nama, String ras) {
        super(nama);
        this.ras = ras;
    }
    
    // Selektor
    public String getRas() {
        return ras;
    }
    
    // Mutator
    public void setRas(String ras) {
        this.ras = ras;
    }
    

    //Methods
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }
    
    // Method tambahan
    public void tampilData() {
        System.out.println("Anjing dengan nama: " + nama + ", Ras: " + ras);
    }
}