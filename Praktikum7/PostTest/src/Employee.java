/*
 * Nama File        : Employee.java
 * Deskripsi        : Abstract class yang merepresentasikan pegawai dengan atribut dasar
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 22 April 2025
 */
public abstract class Employee {
    
    protected String nama;
    protected double gajiPokok;
    
    public Employee(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract double hitungGaji();
    
    public void displayInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Gaji: Rp " + this.hitungGaji());
    }
}