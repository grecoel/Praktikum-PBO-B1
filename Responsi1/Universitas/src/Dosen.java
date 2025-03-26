/**
 * Nama File        : Dosen.java
 * Deskripsi        : Class untuk merepresentasikan dosen dalam universitas
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 25 Maret 2025
 */

public class Dosen extends Karyawan {
    // Attribut
    private Fakultas fakultas;
    private static int counter = 0;

    // Konstruktor tanpa parameter
    public Dosen() {
        super();
        this.fakultas = new Fakultas();
        counter++;
    }

    // Konstruktor dengan parameter
    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        counter++;
    }

    //Selektor
    public Fakultas getFakultas() { 
        return fakultas; 
    }

    // Mutator
    public void setFakultas(Fakultas fakultas) { 
        this.fakultas = fakultas; 
    }

    // Method
    @Override
    public double hitungGaji() {
        double gajiPokok = fakultas.getGajiPokok();
        return gajiPokok + (getMasaKerja() * 0.01 * gajiPokok);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: Rp " + String.format("%.2f", hitungGaji()));
    }

    // Static method 
    public static int getCounter() { 
        return counter; 
    }
}