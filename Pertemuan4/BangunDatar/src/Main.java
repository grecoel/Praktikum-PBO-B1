/**
 * File: MainBangunDatar.java
 * Deskripsi: Class utama untuk menguji implementasi kelas BangunDatar, Persegi, dan Lingkaran
 * Pembuat: Gege Centiana Putra
 * Tanggal: 12 Maret 2025
 */

 public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi1 = new Persegi();
        Persegi persegi2 = new Persegi(5, "merah", "kuning");
        
        // Membuat objek Lingkaran
        Lingkaran lingkaran1 = new Lingkaran();
        Lingkaran lingkaran2 = new Lingkaran(7, "biru", "hijau");
        
        // Menampilkan informasi Persegi
        System.out.println("=== Informasi Persegi 1 ===");
        persegi1.printInfo();
        System.out.println("Sisi: " + persegi1.getSisi());
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        
        System.out.println("\n=== Informasi Persegi 2 ===");
        persegi2.printInfo();
        System.out.println("Sisi: " + persegi2.getSisi());
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        
        // Menampilkan informasi Lingkaran
        System.out.println("\n=== Informasi Lingkaran 1 ===");
        lingkaran1.printInfo();
        System.out.println("Jari-jari: " + lingkaran1.getJariJari());
        System.out.println("Luas: " + lingkaran1.hitungLuas());
        System.out.println("Keliling: " + lingkaran1.hitungKeliling());
        
        System.out.println("\n=== Informasi Lingkaran 2 ===");
        lingkaran2.printInfo();
        System.out.println("Jari-jari: " + lingkaran2.getJariJari());
        System.out.println("Luas: " + lingkaran2.hitungLuas());
        System.out.println("Keliling: " + lingkaran2.hitungKeliling());
    }
}