/**
 * Nama File        : Fakultas.java
 * Deskripsi        : Class untuk merepresentasikan fakultas dalam universitas
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 25 Maret 2025
 */
public class Fakultas {
    // Attribut
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    // Konstruktor tanpa parameter
    public Fakultas() {
        this.nama = "";
        this.tarifUKT = 0;
        this.gajiPokok = 0;
    }

    // Kontruktor dengan paramater
    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    // Selektor
    public String getNama() { 
        return nama; 
    }

    public double getTarifUKT() { 
        return tarifUKT; 
    }

    public double getGajiPokok() { 
        return gajiPokok; 
    }

    // Mutator
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setTarifUKT(double tarifUKT) { 
        this.tarifUKT = tarifUKT; 
    }

    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }
}
