
# 🐾 Simulasi Anabul (Hewan Peliharaan)

## Deskripsi
Program ini merupakan simulasi interaktif yang menampilkan bunyi dan gerakan dari berbagai jenis hewan peliharaan seperti **Kucing**, **Anjing**, dan **Burung**. Program menggunakan konsep **inheritance**, **polimorfisme**, dan **abstraksi** dalam pemrograman berorientasi objek (OOP) di Java.

## Struktur Program
Program ini terdiri dari lima file Java utama:
- `Main.java` — Program utama untuk menjalankan simulasi.
- `Anabul.java` — Kelas abstrak induk untuk semua jenis hewan peliharaan.
- `Kucing.java` — Subkelas dari `Anabul` yang merepresentasikan hewan kucing.
- `Anjing.java` — Subkelas dari `Anabul` yang merepresentasikan hewan anjing.
- `Burung.java` — Subkelas dari `Anabul` yang merepresentasikan hewan burung.

## Fitur
- Menampilkan data awal hewan peliharaan (nama, jenis, dan atribut khusus).
- Simulasi suara dan gerakan setiap hewan menggunakan metode polimorfik `bersuara()` dan `bergerak()`.
- Perubahan atribut setelah instansiasi objek dan penampilan data yang telah diperbarui.

## Cara Menjalankan
1. Kompilasi semua file Java:
   ```bash
   javac *.java
   ```
2. Jalankan program utama:
   ```bash
   java Main
   ```

## Contoh Output
```
SIMULASI ANABUL:
================

Data Anabul 1:
Jenis   : Kucing
Nama    : Meowth
Warna Bulu     : Orange
Meowth bersuara: Meong!
Meowth bergerak dengan melata.
...

Simulasi Perubahan Data
=======================

Data Kucing setelah diubah:
Kucing dengan nama: Kitty, Warna bulu: Hitam
Kitty bersuara: Meong!
Kitty bergerak dengan melata.
...
```

## Pembuat
- **Nama**: Gege Centiana Putra  
- **NIM**: 24060123120024  
- **Tanggal Pembuatan**: 26 April 2025
