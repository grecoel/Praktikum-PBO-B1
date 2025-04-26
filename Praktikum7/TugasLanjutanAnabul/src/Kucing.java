/**
 * Nama File        : Kucing.java
 * Deskripsi        : Kelas turunan dari Anabul yang merepresentasikan Kucing
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 26 April 2025
 */

 public class Kucing extends Anabul {
    // Atribut khusus untuk Kucing
    private String warnaBulu;
    
    // Konstruktor
    public Kucing(String nama) {
        super(nama);
        this.warnaBulu = "Putih"; 
    }
    
    public Kucing(String nama, String warnaBulu) {
        super(nama);
        this.warnaBulu = warnaBulu;
    }
    
    // Selektor
    public String getWarnaBulu() {
        return warnaBulu;
    }
    
    // Mutator
    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }
    
    // Method tambahan
    public void tampilData() {
        System.out.println("Kucing dengan nama: " + nama + ", Warna bulu: " + warnaBulu);
    }
}