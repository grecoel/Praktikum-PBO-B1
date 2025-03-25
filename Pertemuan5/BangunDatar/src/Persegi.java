/**
 * File: Lingkaran.java
 * Deskripsi: Implementasi kelas Persegi yang mewarisi kelas BangunDatar
 * Pembuat: Gege Centiana Putra
 * Tanggal: 18 Maret 2025
 */

public class Persegi extends BangunDatar implements IResize{
    // Atribut tambahan untuk Persegi
    private double sisi;

    // Konstruktor default
    public Persegi() {
        setJmlSisi(4); 
    }

    // Konstruktor berparameter
    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border); 
        this.sisi = sisi;
    }

    // Getter dan Setter untuk sisi
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    // Method untuk menghitung diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Persegi: ");
        BangunDatar.printCounterBangunDatar();
    }

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}