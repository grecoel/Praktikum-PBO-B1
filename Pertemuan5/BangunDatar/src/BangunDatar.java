/* Nama File        : BangunDatar.java
 * Deskripsi        : merupakan program kelas bangun datar
 * Pembuat          : Gege Centiana Putra
 * Tanggal          : 18 Maret 2025
*/

public abstract class BangunDatar {
    // Atribut
    protected int jmlSisi;  // Jumlah sisi
    protected String warna; // Warna bangun datar
    protected String border; // Jenis border
    public static int counterBangunDatar = 0;

    // Konstruktor default
    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String Warna, String Border){
        this.jmlSisi = jmlSisi;
        this.warna = Warna;
        this.border = Border;
        counterBangunDatar++;
    }

     // Getter dan Setter untuk jmlSisi
     public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Getter dan Setter untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan Setter untuk border
    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Method 
    public abstract double getLuas();

    public abstract double getKeliling();

    // Method untuk menampilkan informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: "+ counterBangunDatar);
    }
}