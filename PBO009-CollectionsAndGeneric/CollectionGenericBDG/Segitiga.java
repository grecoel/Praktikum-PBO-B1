/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionGenerikB;

/**
 * Nama File        : Segitiga.java
 * Deskripsi        : Subclass BangunDatar, merepresentasikan segitiga
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 11 Mei 2025
 */
public class Segitiga extends BangunDatar {
    //atribut
    private double alas, tinggi, sisi;

    // konstruktor
    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    
    //selektor
    public double getAlas(){
        return alas;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public double getSisi(){
        return sisi;
    }
    
    //mutator
    public void setAlas(double alas){
        this.alas = alas;
    }
    
    public void seTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    //methods
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 3 * sisi;
    }
}

