package CollectionsAnabul;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama File        : Koleksi.java
 * Deskripsi        : Implementasi kelas koleksi generik dengan operasi dasar
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 11 Mei 2025
 */
import java.util.ArrayList;
import java.util.List;

public class Koleksi<T> {
    //atribut
    private int nbelm;
    private List<T> wadah;
    
    
    //konstruktor
    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }
    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }
    
    public T getIsi(int idx) {
        return wadah.get(idx);
    }

    public void setIsi(int idx, T nilai) {
        wadah.set(idx, nilai);
    }

    public void add(T e) {
        wadah.add(e);
        nbelm = wadah.size();
    }

    public T delete() {
        if (nbelm == 0) {
            return null; 
        }
        T e = wadah.get(nbelm - 1); 
        wadah.remove(nbelm - 1);   
        nbelm = wadah.size();       
        return e;                   
    }

    public void showAll() {
        for (T e : wadah) {
            System.out.println(e);
        }
    }
}
