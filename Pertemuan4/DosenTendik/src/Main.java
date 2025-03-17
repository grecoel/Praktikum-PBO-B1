/*
 * File: Main.java
 * Deskripsi: Kelas utama untuk menjalankan program dan menguji kelas-kelas yang telah dibuat
 * Tanggal: 12 Maret 2025
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dt = new DosenTetap();
        dt.setNip("19840312001");
        dt.setNama("Dr. Ahmad Santoso");
        dt.setTanggalLahir(LocalDate.of(1984, 3, 12));
        dt.setTmt(LocalDate.of(2015, 1, 1));
        dt.setGajiPokok(25_000_000);
        dt.setFakultas("Teknik Informatika");
        dt.setNidn("123456789");

        DosenTamu dtu = new DosenTamu(
            "19900215002",
            "Prof. Bambang Wijaya", 
            LocalDate.of(1990, 2, 15),
            LocalDate.of(2020, 6, 1),
            18_000_000,
            "Ekonomi",
            "DT987654",
            LocalDate.of(2025, 12, 31)
        );

        Tendik t = new Tendik();
        t.setNip("19751203003");
        t.setNama("Siti Aminah");
        t.setTanggalLahir(LocalDate.of(1975, 12, 3));
        t.setTmt(LocalDate.of(2005, 3, 15));
        t.setGajiPokok(12_000_000);
        t.setBidang("Akademik");

        // Test output
        System.out.println("------Informasi Dosen Tetap------");
        dt.printInfo();
        System.out.println("------Informasi Dosen Tamu------");
        dtu.printInfo();
        System.out.println("------Informasi Tendik------");
        t.printInfo();

        //
        System.out.println("------Informasi Jumlah------");
        Pegawai.printCounterPegawai();
        Dosen.printCounterDosen();
        DosenTetap.printCounterDt();
        DosenTamu.printCounterDtu();
        Tendik.printCounterTendik();
    }
}