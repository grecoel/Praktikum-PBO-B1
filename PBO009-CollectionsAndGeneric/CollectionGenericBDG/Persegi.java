/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionGenerikB;

/**
 * Nama File        : Persegi.java
 * Deskripsi        : Subclass BangunDatar, merepresentasikan persegi
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 11 Mei 2025
 */
public class Persegi extends BangunDatar {
    //atribut
    private double sisi;
    
    
    //konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    //selektor
    public double getSisi(){
        return sisi;
    }
    
    //mutator
    public void setSisi(){
        this.sisi = sisi;
    }
    
    //methods
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}


