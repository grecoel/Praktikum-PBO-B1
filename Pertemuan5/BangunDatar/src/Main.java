/**
 * File: MainBangunDatar.java
 * Deskripsi: Class utama untuk menguji implementasi kelas BangunDatar, Persegi, dan Lingkaran
 * Pembuat: Gege Centiana Putra
 * Tanggal: 18 Maret 2025
 */

 public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan reference type BangunDatar
        // BangunDatar B1 = new BangunDatar(); // error karena BangunDatar abstract
        
        BangunDatar P1 = new Persegi(10, "Merah", "Solid");
        Persegi P2 = new Persegi(5, "Biru", "Dotted");
        
        BangunDatar L1 = new Lingkaran(7, "Hijau", "Dashed");
        Lingkaran L2 = new Lingkaran(14, "Kuning", "Double");
        
        // Menampilkan informasi
        System.out.println("=== Informasi Persegi 1 ===");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        
        System.out.println("\n=== Informasi Persegi 2 ===");
        P2.printInfo();
        System.out.println("Sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());
        System.out.println("Keliling: " + P2.getKeliling());
        
        System.out.println("\n=== Informasi Lingkaran 1 ===");
        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());
        
        System.out.println("\n=== Informasi Lingkaran 2 ===");
        L2.printInfo();
        System.out.println("Jari-jari: " + L2.getJariJari());
        System.out.println("Luas: " + L2.getLuas());
        System.out.println("Keliling: " + L2.getKeliling());
        
        // Membandingkan luas dan keliling
        System.out.println("\n=== Perbandingan Luas dan Keliling ===");
        System.out.println("Apakah P1 dan L1 memiliki luas yang sama? " + isEqualLuas(P1, L1));
        System.out.println("Apakah P2 dan L2 memiliki keliling yang sama? " + isEqualKeliling(P2, L2));
        
        // Menampilkan counter
        BangunDatar.printCounterBangunDatar();

        System.out.println("\n=== Testing IResize ===");
        System.out.println("Sebelum zoomIn:");
        System.out.println("Sisi P2: " + P2.getSisi());
        P2.zoomIn();
        System.out.println("Setelah zoomIn:");
        System.out.println("Sisi P2: " + P2.getSisi());

        System.out.println("\nSebelum zoomOut:");
        System.out.println("Jari-jari L2: " + L2.getJariJari());
        L2.zoomOut();
        System.out.println("Setelah zoomOut:");
        System.out.println("Jari-jari L2: " + L2.getJariJari());

        System.out.println("\nSebelum zoom(200):");
        System.out.println("Sisi P2: " + P2.getSisi());
        P2.zoom(200);
        System.out.println("Setelah zoom(200):");
        System.out.println("Sisi P2: " + P2.getSisi());
    }
    
    // Method untuk membandingkan luas
    public static boolean isEqualLuas(BangunDatar b1, BangunDatar b2) {
        return b1.getLuas() == b2.getLuas();
    }
    
    // Method untuk membandingkan keliling
    public static boolean isEqualKeliling(BangunDatar b1, BangunDatar b2) {
        return b1.getKeliling() == b2.getKeliling();
    }
}