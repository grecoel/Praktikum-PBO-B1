/**
 * Nama File        : Burung.java
 * Deskripsi        : Kelas turunan dari Anabul yang merepresentasikan Burung
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 26 April 2025
 */

 public class Burung extends Anabul {
    // Atribut khusus untuk Burung
    private double panjangSayap;
    
    // Konstruktor
    public Burung(String nama) {
        super(nama);
        this.panjangSayap = 10.0; 
    }
    
    public Burung(String nama, double panjangSayap) {
        super(nama);
        this.panjangSayap = panjangSayap;
    }
    
    // Selektor
    public double getPanjangSayap() {
        return panjangSayap;
    }
    
    // Mutator
    public void setPanjangSayap(double panjangSayap) {
        this.panjangSayap = panjangSayap;
    }

    // Mthods
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }
    
    // Method tambahan
    public void tampilData() {
        System.out.println("Burung dengan nama: " + nama + ", Panjang sayap: " + panjangSayap + " cm");
    }
}