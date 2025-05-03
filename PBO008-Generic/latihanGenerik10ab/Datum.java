/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanGenerik10ab;

/**
 * Nama File        : Datum.java
 * Deskripsi        : Kelas generik untuk menyimpan data bertipe generic G
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 1 Mei 2025
 */

public class Datum<G> {
    // Attribut
    private G isi;
    
    // Method
    public G getIsi(){
        return isi;
    }
    
    void setIsi(G x){
        this.isi = x;
    }
}
