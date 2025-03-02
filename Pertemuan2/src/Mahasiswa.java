/* File : Mahasiswa.java */
/* Deskripsi : Program mahasiswa */
/* NIM & Nama : 24060123120024 & Gege Centiana Putra */
/* Tanggal : 25 Februari 2025 */

import java.util.ArrayList;

public class Mahasiswa {
    //attribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //konstruktor
    public Mahasiswa(){
        this.listMatkul = new ArrayList<MataKuliah>();
        this.nim = "###";
        this.nama = "###";
        this.prodi = "###";
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //konstruktor
    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan){
        this.listMatkul = new ArrayList<MataKuliah>();
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    //selektor
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    //mutator
    public void setNim(String x){
        this.nim = x;
    }

    public void setNama(String x){
        this.nama = x;
    }
    
    public void setProdi(String x){
        this.prodi = x;
    }

    public void setDosenWali(Dosen x){
        this.dosenWali = x;
    }

    public void setKendaraan(Kendaraan x){
        this.kendaraan = x;
    }

    //method
    public void addMatKul(MataKuliah newMatKul){
        listMatkul.add(newMatKul);
    }

    //method untuk mendapatkan jumlah sks mata kuliah
    public int getJumlahSKS(){
        //kamus
        int sum;

        //algoritma
        sum = 0;
        for (MataKuliah mk : listMatkul){
            sum += mk.getSks();
        }
        return sum;
    }

    //method untuk mendapatkan jumlah mat akuliah yang diambil mahasiswa
    public int getJumlahMatKul(){
        return listMatkul.size();
    }

    //method untuk menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    //mehod untuk menampilkan nim, nama, peodi, daftar mata kuliah yang diambil, data dosen wali, data kendaraan
    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah yang diambil: ");
        for (MataKuliah mk : listMatkul){
            System.out.println("ID Mata Kuliah: " + mk.getidMatKul());
            System.out.println("Nama Mata Kuliah: " + mk.getNama());
            System.out.println("SKS: " + mk.getSks());
        }
        System.out.println("Data Dosen Wali: ");
        System.out.println("Nama: " + dosenWali.getNama());
        System.out.println("NIP: " + dosenWali.getNip());
        System.out.println("Data Kendaraan: ");
        System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
        System.out.println("Nomor Polisi: " + kendaraan.getnoPlat());
    }
}
