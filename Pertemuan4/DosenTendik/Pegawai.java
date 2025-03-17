classDiagram
    class Pegawai {
        - String nip
        - String nama
        - LocalDate tanggalLahir
        - LocalDate tmt
        - double gajiPokok
        + Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok)
        + hitungMasaKerja(): String
        + hitungTunjangan(): double
        + printInfo(): void
    }

    class Dosen {
        <<abstract>>
        - String fakultas
        + Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas)
    }

    class DosenTetap {
        - String nidn
        - static final int BUP = 65
        + DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn)
        + hitungTunjangan(): double
        + hitungBUP(): LocalDate
        + printInfo(): void
    }

    class DosenTamu {
        - String nidk
        - LocalDate tanggalBerakhirKontrak
        + DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tanggalBerakhirKontrak)
        + hitungTunjangan(): double
        + hitungSisaKontrak(): String
        + printInfo(): void
    }

    class Tendik {
        - String bidang
        - static final int BUP = 55
        + Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang)
        + hitungTunjangan(): double
        + hitungBUP(): LocalDate
        + printInfo(): void
    }

    Pegawai <|-- Dosen
    Pegawai <|-- Tendik
    Dosen <|-- DosenTetap
    Dosen <|-- DosenTamu