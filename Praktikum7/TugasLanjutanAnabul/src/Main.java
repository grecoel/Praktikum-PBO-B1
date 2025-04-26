/**
 * Nama File        : Main.java
 * Deskripsi        : Program utama yang mensimulasikan semua bunyi dan gerakan setiap tipe anabul
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 26 April 2025
 */

 public class Main {
    public static void main(String[] args) {
        // Instansiasi
        Kucing kucing = new Kucing("Meowth", "Orange");
        Anjing anjing = new Anjing("Doggy", "Golden Retriever");
        Burung burung = new Burung("Tweety", 15.5);
        
        // array for objek
        Anabul[] daftarAnabul = {kucing, anjing, burung};
        
        // simulasi gerak dan bunyi
        System.out.println("SIMULASI ANABUL:");
        System.out.println("================");
        
        for (int i = 0; i < daftarAnabul.length; i++) {
            System.out.println("\nData Anabul " + (i+1) + ":");
            System.out.println("Jenis \t: " + daftarAnabul[i].getClass().getSimpleName());
            System.out.println("Nama \t: " + daftarAnabul[i].getNama());
            
            // detail spesifik berdasarkan class
            if (daftarAnabul[i] instanceof Kucing) {
                Kucing k = (Kucing) daftarAnabul[i];
                System.out.println("Warna Bulu \t: " + k.getWarnaBulu());
            } else if (daftarAnabul[i] instanceof Anjing) {
                Anjing a = (Anjing) daftarAnabul[i];
                System.out.println("Ras \t: " + a.getRas());
            } else if (daftarAnabul[i] instanceof Burung) {
                Burung b = (Burung) daftarAnabul[i];
                System.out.println("Panjang Sayap \t: " + b.getPanjangSayap() + " cm");
            }
            
            // pemanggilan gerak dan bunyi (polimorfisme)
            daftarAnabul[i].bersuara();
            daftarAnabul[i].bergerak();
            System.out.println("----------------");
        }
        
        // perubahan data
        System.out.println("=======================");
        System.out.println("\nSimulasi Perubahan Data");
        System.out.println("=======================");
        
        kucing.setNama("Kitty");
        kucing.setWarnaBulu("Hitam");
        
        anjing.setNama("Rex");
        anjing.setRas("Siberian Husky");
        
        burung.setNama("Riri");
        burung.setPanjangSayap(20.0);
        
        // Menampilkan data yang telah diubah
        System.out.println("\nData Kucing setelah diubah:");
        kucing.tampilData();
        kucing.bersuara();
        kucing.bergerak();
        
        System.out.println("\nData Anjing setelah diubah:");
        anjing.tampilData();
        anjing.bersuara();
        anjing.bergerak();
        
        System.out.println("\nData Burung setelah diubah:");
        burung.tampilData();
        burung.bersuara();
        burung.bergerak();
    }
}