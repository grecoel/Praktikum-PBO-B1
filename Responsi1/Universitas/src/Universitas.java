/**
 * Nama File        : Universitas.java
 * Deskripsi        : Class untuk merepresentasikan universitas dan mengelola fakultas
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 25 Maret 2025
 */

import java.util.ArrayList;

public class Universitas {
    // Attribut
    private String nama;
    private ArrayList<Fakultas> listFakultas;
    private ArrayList<CivitasAkademika> listCivitasAkademika;

    // Konstruktor tanpa parameter
    public Universitas() {
        this("");
    }

    // Konstruktor dengan parameter
    public Universitas(String nama) {
        this.nama = nama;
        this.listFakultas = new ArrayList<>();
        this.listCivitasAkademika = new ArrayList<>();
    }

    // Selektor
    public String getNama() { 
        return nama; 
    }

    // Mutator
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    // Methods
    public void tambahFakultas(Fakultas fakultas) {
        listFakultas.add(fakultas);
    }

    public void tambahCivitasAkademika(CivitasAkademika civitasAkademika) {
        listCivitasAkademika.add(civitasAkademika);
    }

    public void printInfo() {
        System.out.println("Universitas: " + nama);
    }

    public void printInfoFakultas() {
        System.out.println("Daftar Fakultas di " + nama + ":");
        for (Fakultas fakultas : listFakultas) {
            System.out.println("- " + fakultas.getNama());
        }
    }

    public void printInfoCivitasAkademika() {
        System.out.println("Daftar Civitas Akademika di " + nama + ":");
        for (CivitasAkademika civitas : listCivitasAkademika) {
            civitas.printInfo();
            System.out.println("---");
        }
    }

}