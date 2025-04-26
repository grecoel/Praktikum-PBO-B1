/**
 * Nama File        : Programmer.java
 * Deskripsi        : Subclass dari Pegawai yang merepresentasikan programmer
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 22 April 2025
 */

 public class Programmer extends Pegawai {
    // Atribut tambahan
    private int bonus = 450000;

    // Konstruktor
    public Programmer(String nama) {
        super(nama);
    }

    // Selektor
    public int getBonus() {
        return bonus;
    }

    // Mutator
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    // Override tampil data
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}


