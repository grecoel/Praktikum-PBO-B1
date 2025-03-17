/*
 * File: Pegawai.java
 * Deskripsi: Kelas dasar untuk sistem kepegawaian perguruan tinggi
 * Tanggal: 12 Maret 2025
 * Nama : Gege Centiana Putra
 */

import java.time.*;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    // Atribut
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;
    private static int counterPegawai = 0;

    // Konstruktor tanpa parameter
    public Pegawai() {
        this.nip = "";
        this.nama = "";
        this.tanggalLahir = LocalDate.now();
        this.tmt = LocalDate.now();
        this.gajiPokok = 0.0;
        counterPegawai++;
    }

    // Konstruktor berparameter
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
        counterPegawai++;
    }

    // Selektor
    public String getNip() { 
        return nip; 
    }

    public String getNama() { 
        return nama; 
    }

    public LocalDate getTanggalLahir() { 
        return tanggalLahir; 
    }

    public LocalDate getTmt() { 
        return tmt; 
    }

    public double getGajiPokok() { 
        return gajiPokok; 
    }
    
    // Mutator
    public void setNip(String nip) { 
        this.nip = nip; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }
    
    public void setTanggalLahir(LocalDate tanggalLahir) { 
        this.tanggalLahir = tanggalLahir; 
    }

    public void setTmt(LocalDate tmt) { 
        this.tmt = tmt; 
    }

    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }
    
    // Method
    public String hitungMasaKerja() {
        Period period = Period.between(tmt, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    public double hitungTunjangan() {
        return 0;
    }

    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
        System.out.println("TMT: " + tmt.format(formatter));
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Gaji Pokok: Rp" + String.format("%,.2f", gajiPokok));
    }

    public static void printCounterPegawai(){
        System.out.println("Jumlah Pegawai: "+ counterPegawai);
    }
}