/*
 * File: Dosen.java
 * Deskripsi: Kelas untuk dosen yang mewarisi kelas Pegawai
 * Tanggal: 12 Maret 2025
 * Nama : Gege Centiana Putra
 */

import java.time.*;

public class Dosen extends Pegawai {
    protected String fakultas;
    private static int counterDosen = 0;

    // Konstruktor tanpa parameter
    public Dosen() {
        super();
        this.fakultas = "";
        counterDosen++;
    }

    // Konstruktor berparameter
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
        counterDosen++;
    }

    // Selektor
    public String getFakultas() { 
        return fakultas; 
    }

    // Mutator
    public void setFakultas(String fakultas) { 
        this.fakultas = fakultas; 
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: "+ fakultas);
    }

    public static void printCounterDosen(){
        System.out.println("Jumlah Dosen: " + counterDosen);
    }
}