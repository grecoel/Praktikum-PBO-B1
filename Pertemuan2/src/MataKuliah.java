/* File : MataKuliah.java */
/* Deskripsi : Program matakuliah */
/* NIM & Nama : 24060123120024 & Gege Centiana Putra */
/* Tanggal : 25 Februari 2025 */
public class MataKuliah {
    //attribut 
    private String idMatKul;
    private String nama;
    private int sks;

    //method

    //konstruktor
    public MataKuliah(){
        idMatKul = "####";
        nama = "####";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatKul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor
    public String getidMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    //mutator
    public void setidMatKul(String id){
        this.idMatKul = id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}