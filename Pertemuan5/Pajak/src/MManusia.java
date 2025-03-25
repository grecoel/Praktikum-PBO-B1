/**
 * Nama File        : MManusia.java
 * Deskripsi        : Class utama untuk menguji implementasi sistem perhitungan pajak
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 18 Maret 2025
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
 

public class MManusia {
    public static void main(String[] args) throws ParseException {
        // Format tanggal
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        // Membuat objek
        PNS p1 = new PNS("Satriyo", sdf.parse("01-04-2006"), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", sdf.parse("01-01-2000"), "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", sdf.parse("09-01-1977"), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", sdf.parse("01-04-2010"), "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // Menampilkan informasi
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("\nPajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("\nMasa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        System.out.println("\n=== Info P1 ===");
        p1.cetakInfo();
        
        System.out.println("\n=== Info PE1 ===");
        pe1.cetakInfo();
        
        System.out.println("\n=== Info PT1 ===");
        pt1.cetakInfo();
    }
}