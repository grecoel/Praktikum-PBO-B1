/**
 * Nama File        : Pegawai.java
 * Deskripsi        : Kelas induk untuk semua jenis pegawai
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 22 April 2025
 */

 public class Pegawai {
    // Atribut
    protected String nama;
    protected int gajiPokok = 5000000;

    // Konstruktor
    public Pegawai(String nama) {
        this.nama = nama;
    }

    // Selektor
    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }


    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Method tampil data
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}


