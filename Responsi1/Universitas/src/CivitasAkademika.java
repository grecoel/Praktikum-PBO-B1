/**
 * Nama File        : CivitasAkademika.java
 * Deskripsi        : Abstract class sebagai parent untuk Mahasiswa dan Karyawan
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 25 Maret 2025
 */

public abstract class CivitasAkademika {
    // Attribut
    private String nama;
    private String email;

    // Konstruktor tanpa parameter
    public CivitasAkademika() {
        this.nama = "";
        this.email = "";
    }

    // Konstruktor dengan parameter
    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    // Selektor
    public String getNama() { 
        return nama; 
    }

    public String getEmail() { 
        return email; 
    }

    // Mutator
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email tidak valid");
        }
        this.email = email;
    }

    // Method
    public abstract void printInfo();
}
