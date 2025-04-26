/**
 * Nama File        : TestPolimorfisme.java
 * Deskripsi        : Program utama untuk menguji polimorfisme dengan class Pegawai
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 22 April 2025
 */

 import java.util.ArrayList;

 public class TestPolimorfisme {
     public static void main(String[] args) {
         Pegawai pegawai1 = new Programmer("Mira");
         Pegawai pegawai2 = new Manajer("Joko");
         Pegawai pegawai3 = new Manajer("Argo");
 
         ArrayList<Pegawai> emps = new ArrayList<>();
         emps.add(pegawai1);
         emps.add(pegawai2);
         emps.add(pegawai3);
 
         for (Pegawai emp : emps) {
             emp.tampilData();
         }
     }
 }
 

 