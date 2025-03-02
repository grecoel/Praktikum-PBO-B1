/* File : Dosen.java */
/* Deskripsi : Program dosen */
/* NIM & Nama : 24060123120024 & Gege Centiana Putra */
/* Tanggal : 25 Februari 2025 */

public class Dosen {
    //attribut
    private String nip;
    private String nama;
    private String prodi;


    //method

    //konstruktor
    public Dosen(){
        nip = "####";
        nama = "####";
        prodi = "####";
    }
    
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //selektor
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    //mutator 
    public void setNip(String x){
        this.nip = x;
    }

    public void setNama(String x){
        this.nama = x;
    }

    public void setProdi(String x){
        this.prodi = x;
    }
}