/**
 * File: Lingkaran.java
 * Deskripsi: Implementasi kelas Lingkaran yang mewarisi kelas BangunDatar
 * Pembuat: Gege Centiana Putra
 * Tanggal: 18 Maret 2025
 */

 public class Lingkaran extends BangunDatar implements IResize{
    // Attribut
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
    public double getLuas() {
        return Math.PI * this.jariJari * this.jariJari;
    }
    
    public double getKeliling() {
        return 2 * Math.PI * this.jariJari;
    }

    @Override
    public void zoomIn() {
        this.jariJari *= 1.1;
    }
    
    @Override
    public void zoomOut() {
        this.jariJari *= 0.9;
    }
    
    @Override
    public void zoom(int percent) {
        this.jariJari *= (percent / 100.0);
    }
}