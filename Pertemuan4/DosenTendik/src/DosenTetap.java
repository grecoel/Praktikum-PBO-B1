/*
 * File: DosenTetap.java
 * Deskripsi: Kelas untuk dosen tetap yang mewarisi kelas Dosen
 * Tanggal: 12 Maret 2025
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DosenTetap extends Dosen {
    private String nidn;
    private static final int BUP = 65;
    private static int counterDt = 0;

    // Konstruktor tanpa parameter
    public DosenTetap() {
        super();
        this.nidn = "";
        counterDt++;
    }

    // Konstruktor berparameter
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                     double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
        counterDt++;
    }

    // Selektor
    public String getNidn() { 
        return nidn; 
    }

    // Mutator
    public void setNidn(String nidn) { 
        this.nidn = nidn; 
    }

    //Method
    @Override
    public double hitungTunjangan() {
        Period masaKerja = Period.between(getTmt(), LocalDate.now());
        return 0.02 * masaKerja.getYears() * getGajiPokok();
    }

    private LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("Jenis: Dosen Tetap");
        System.out.println("NIDN: " + nidn);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Tunjangan: Rp" + String.format("%,.2f", hitungTunjangan()));
        System.out.println("BUP: " + hitungBUP().format(formatter));
        System.out.println("-----------------------------------");
    }

    public static void printCounterDt(){
        System.out.println("Jumlah Dosen Tetap: "+ counterDt);
    }
}