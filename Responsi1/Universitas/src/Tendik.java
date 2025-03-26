/**
 * Nama File        : Tendik.java
 * Deskripsi        : Class untuk merepresentasikan tenaga pendidikan dalam universitas
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 25 Maret 2025
 */

 public class Tendik extends Karyawan {
    // Attribut
    private static int counter = 0;
    private static final double GAJI_POKOK = 4000000.0;

    // Konstruktor tanpa parameter
    public Tendik() {
        super();
        counter++;
    }

    // Konstruktor dengan parameter
    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        counter++;
    }

    // Method
    @Override
    public double hitungGaji() {
        return GAJI_POKOK + (getMasaKerja() * 0.01 * GAJI_POKOK);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji: Rp " + String.format("%.2f", hitungGaji()));
    }

    // Static method 
    public static int getCounter() { 
        return counter; 
    }
}