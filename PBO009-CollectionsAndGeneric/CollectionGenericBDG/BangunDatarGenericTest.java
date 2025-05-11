/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionGenerikB;

/**
 * Nama File        : BangunDatarGenericTest.java
 * Deskripsi        : Program utama untuk menguji penggunaan generic dengan berbagai bangun datar
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 11 Mei 2025
 */
public class BangunDatarGenericTest {
    public static void main(String[] args){
        // === Lingkaran ===
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<>();
        bdgLingkaran.set(l);
        System.out.println("Keliling Lingkaran: " + bdgLingkaran.hitungKeliling());
        System.out.println("Tipe generic: " + bdgLingkaran.get().getClass().getSimpleName());

        // === Persegi ===
        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<>();
        bdgPersegi.set(p);
        System.out.println("\nKeliling Persegi: " + bdgPersegi.hitungKeliling());
        System.out.println("Tipe generic: " + bdgPersegi.get().getClass().getSimpleName());

        // === Persegi Panjang ===
        PersegiPanjang pp = new PersegiPanjang(3, 5);
        BangunDatarGeneric<PersegiPanjang> bdgPP = new BangunDatarGeneric<>();
        bdgPP.set(pp);
        System.out.println("\nKeliling Persegi Panjang: " + bdgPP.hitungKeliling());
        System.out.println("Tipe generic: " + bdgPP.get().getClass().getSimpleName());

        // === Segitiga ===
        Segitiga s = new Segitiga(3, 4, 5);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<>();
        bdgSegitiga.set(s);
        System.out.println("\nKeliling Segitiga: " + bdgSegitiga.hitungKeliling());
        System.out.println("Tipe generic: " + bdgSegitiga.get().getClass().getSimpleName());
    }
}

