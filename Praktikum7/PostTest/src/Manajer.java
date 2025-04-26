/**
 * Nama File        : Manajer.java
 * Deskripsi        : Subclass dari Pegawai yang merepresentasikan manajer
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 22 April 2025
 */

 public class Manajer extends Pegawai {
    // Atribut 
    private int tunjangan = 700000;

    // Konstruktor
    public Manajer(String nama) {
        super(nama);
    }

    // Selektor
    public int getTunjangan() {
        return tunjangan;
    }

    // Mutator
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Override tampil data
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}


