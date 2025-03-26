/**
 * Nama File        : Main.java
 * Deskripsi        : Class utama untuk mendemonstrasikan sistem universitas
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 25 Maret 2025
 */

 public class Main {
    public static void main(String[] args) {
        Universitas univ = new Universitas("Universitas Diponegoro");

        Fakultas teknik = new Fakultas("Fakultas Teknik", 10000000, 5000000);
        Fakultas ekonomi = new Fakultas("Fakultas Ekonomi", 9000000, 4500000);
        Fakultas hukum = new Fakultas("Fakultas Hukum", 8500000, 4200000);
        Fakultas kedokteran = new Fakultas("Fakultas Kedokteran", 12000000, 6000000);
        
        univ.tambahFakultas(teknik);
        univ.tambahFakultas(ekonomi);
        univ.tambahFakultas(hukum);
        univ.tambahFakultas(kedokteran);

        Mahasiswa mhs1 = new Mahasiswa("Gege Centiana", "gege@example.com", "24060123120024", 3, teknik);
        Mahasiswa mhs2 = new Mahasiswa("Putra Aditya", "putra@example.com", "24060123120025", 1, ekonomi);
        Mahasiswa mhs3 = new Mahasiswa("Firzi Ass", "firzi@example.com", "24060123120026", 5, hukum);
        Mahasiswa mhs4 = new Mahasiswa("Dimas Aqsho", "dimas@example.com", "24060123120027", 2, kedokteran);

        Dosen dosen1 = new Dosen("Prof. Dr. Sutanto", "sutanto@example.com", "D001", 10, teknik);
        Dosen dosen2 = new Dosen("Dr. Elrado", "elrado@example.com", "D002", 5, ekonomi);
        Dosen dosen3 = new Dosen("Dr. Dzu", "dzu@example.com", "D003", 8, hukum);
        Dosen dosen4 = new Dosen("Prof. Dr. Raja", "raja@example.com", "D004", 15, kedokteran);

        Tendik tendik1 = new Tendik("Joko Susilo", "joko@example.com", "T001", 7);
        Tendik tendik2 = new Tendik("Siti Aminah", "siti@example.com", "T002", 3);
        Tendik tendik3 = new Tendik("Bambang Setiawan", "bambang@example.com", "T003", 5);

        univ.tambahCivitasAkademika(mhs1);
        univ.tambahCivitasAkademika(mhs2);
        univ.tambahCivitasAkademika(mhs3);
        univ.tambahCivitasAkademika(mhs4);
        univ.tambahCivitasAkademika(dosen1);
        univ.tambahCivitasAkademika(dosen2);
        univ.tambahCivitasAkademika(dosen3);
        univ.tambahCivitasAkademika(dosen4);
        univ.tambahCivitasAkademika(tendik1);
        univ.tambahCivitasAkademika(tendik2);
        univ.tambahCivitasAkademika(tendik3);

        System.out.println("====================================");
        System.out.println("      SISTEM INFORMASI AKADEMIK     ");
        System.out.println("====================================\n");
        
        univ.printInfo();
        
        System.out.println("\n=== Informasi Fakultas ===");
        univ.printInfoFakultas();
        
        System.out.println("\n=== Informasi Civitas Akademika ===");
        univ.printInfoCivitasAkademika();

        System.out.println("\n=== Statistik Civitas Akademika ===");
        System.out.println("Jumlah Mahasiswa\t: " + Mahasiswa.getCounter());
        System.out.println("Jumlah Dosen\t: " + Dosen.getCounter());
        System.out.println("Jumlah TenagaPendidikan\t: " + Tendik.getCounter());
        System.out.println("Total Civitas Akademika\t: " + (Mahasiswa.getCounter() + Dosen.getCounter() + Tendik.getCounter()));
    }
}