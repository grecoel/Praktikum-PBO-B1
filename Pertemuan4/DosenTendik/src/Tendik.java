/*
 * File: Tendik.java
 * Deskripsi: Kelas untuk tenaga kependidikan yang mewarisi kelas Pegawai
 * Tanggal: 12 Maret 2025
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;
    private static int counterTendik = 0;

    // Konstruktor tanpa parameter
    public Tendik() {
        super();
        this.bidang = "";
        counterTendik++;
    }

    // Konstruktor berparameter
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                 double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
        counterTendik++;
    }

    // Selektor
    public String getBidang() { 
        return bidang; 
    }

    //Mutator
    public void setBidang(String bidang) { 
        this.bidang = bidang; 
    }

    // Method
    @Override
    public double hitungTunjangan() {
        Period masaKerja = Period.between(getTmt(), LocalDate.now());
        return 0.01 * masaKerja.getYears() * getGajiPokok();
    }

    private LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("Jenis: Tenaga Kependidikan");
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: Rp" + String.format("%,.2f", hitungTunjangan()));
        System.out.println("BUP: " + hitungBUP().format(formatter));
        System.out.println("-----------------------------------");
    }

    public static void printCounterTendik(){
        System.out.println("Jumlah Tendik:" + counterTendik);
    }
}