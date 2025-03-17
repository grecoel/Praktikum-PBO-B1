/**
 * File: Lingkaran.java
 * Deskripsi: Implementasi kelas Lingkaran yang mewarisi kelas BangunDatar
 * Pembuat: Gege Centiana Putra
 * Tanggal: 12 Maret 2025
 */

 public class Lingkaran extends BangunDatar {
    private double jariJari;
    
    // Constructor
    public Lingkaran() {
        this.setJmlSisi(1);
        this.jariJari = 1;
    }
    
    public Lingkaran(double jariJari, String warna, String border) {
        this.setJmlSisi(1);
        this.setWarna(warna);
        this.setBorder(border);
        this.jariJari = jariJari;
    }
    
    // Selektor
    public double getJariJari() {
        return jariJari;
    }
    
    // Mutator
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    // Methods
    public double hitungLuas() {
        return Math.PI * this.jariJari * this.jariJari;
    }
    
    public double hitungKeliling() {
        return 2 * Math.PI * this.jariJari;
    }
}