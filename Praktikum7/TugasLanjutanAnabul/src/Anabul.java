
/*  
 * Nama File        : Anabul.java  
 * Deskripsi        : Abstract class yang merepresentasikan hewan peliharaan  
 * Pembuat          : Gege Centiana Putra  
 * NIM              : 24060123120024  
 * Tanggal Pembuatan: 26 April 2025  
 */

public abstract class Anabul {
    // Attribut
    protected String nama;

    // Konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    // Selektor
    public String getNama() {
        return nama;
    }

    // Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    // Abstract Method
    public abstract void bersuara();
    public abstract void bergerak();
}
