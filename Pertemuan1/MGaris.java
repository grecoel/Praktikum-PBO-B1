// Gege Centiana Putra
// Main Program objek garis
// Lab B1 PBO

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Titik
        Titik t1 = new Titik(0, 0);
        Titik t2 = new Titik(3, 4);
        Titik t3 = new Titik(1, 1);
        Titik t4 = new Titik(4, 5);

        // Membuat objek Garis
        Garis g1 = new Garis(t1, t2); // Garis dari (0, 0) ke (3, 4)
        Garis g2 = new Garis(t3, t4); // Garis dari (1, 1) ke (4, 5)

        // Menggunakan semua fungsi dari kelas Garis
        System.out.println("=== Informasi Garis 1 ===");
        g1.printGaris();
        System.out.println("Panjang garis 1: " + g1.getPanjang());
        System.out.println("Gradien garis 1: " + g1.getGradien());
        System.out.println("Titik tengah garis 1: (" + g1.getMidPoint().getAbsis() + ", " + g1.getMidPoint().getOrdinat() + ")");
        g1.printPersamaanGaris();

        System.out.println("\n=== Informasi Garis 2 ===");
        g2.printGaris();
        System.out.println("Panjang garis 2: " + g2.getPanjang());
        System.out.println("Gradien garis 2: " + g2.getGradien());
        System.out.println("Titik tengah garis 2: (" + g2.getMidPoint().getAbsis() + ", " + g2.getMidPoint().getOrdinat() + ")");
        g2.printPersamaanGaris();

        // Mengecek hubungan antara garis 1 dan garis 2
        System.out.println("\n=== Hubungan Garis 1 dan Garis 2 ===");
        System.out.println("Apakah garis 1 sejajar dengan garis 2? " + g1.isSejajar(g2));
        System.out.println("Apakah garis 1 tegak lurus dengan garis 2? " + g1.isTegakLurus(g2));

        // Menggunakan counterGaris
        System.out.println("\nTotal jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}
