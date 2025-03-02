/* File : Kendaraan.java */
/* Deskripsi : Program kendaraan*/
/* NIM & Nama : 24060123120024 & Gege Centiana Putra */
/* Tanggal : 25 Februari 2025 */

public class Kendaraan {
    //attribut
    private String noPlat;
    private String Jenis;

    // method

    //konstruktor
    public Kendaraan(){
        noPlat = "###";
        Jenis = "###";
    }

    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    //selektor
    public String getnoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return Jenis;
    }

    //mutator
    public void setnoPlat(String x){
        this.noPlat = x;
    }

    public void setJenis(String x){
        this.Jenis = x;
    }
}
