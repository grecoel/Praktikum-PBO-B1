/**
 * Nama File        : Karyawan.java
 * Deskripsi        : Abstract class sebagai parent untuk Dosen dan Tendik
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 25 Maret 2025
 */

public abstract class Karyawan extends CivitasAkademika {
    // Attribut
    private String NIP;
    private int masaKerja;

    // Konstruktor tanpa parameter
    public Karyawan() {
        super();
        this.NIP = "";
        this.masaKerja = 0;
    }

    // Konstruktor dengan parameter
    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    // Selektor
    public String getNIP() { 
        return NIP; 
    }

    public int getMasaKerja() { 
        return masaKerja; 
    }

    // Mutator
    public void setNIP(String NIP) { 
        this.NIP = NIP; 
    }

    public void setMasaKerja(int masaKerja) { 
        this.masaKerja = masaKerja; 
    }

    // Abstract method 
    public abstract double hitungGaji();

    @Override
    public void printInfo() {
        System.out.println("===Informasi Karyawan===:");
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
}