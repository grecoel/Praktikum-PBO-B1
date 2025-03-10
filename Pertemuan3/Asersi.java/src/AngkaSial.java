// File : AngkaSial.java
// Deskripsi : Program penggunaan exception buatan sendiri
//             Pengenalan klausa 'throw' dan 'throws'
// nama : Gege Centiana Putra PBO B1

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        System.out.println("Mencoba angka " + angka);
        if (angka == 13) {
            throw new AngkaSialException("Angka sial terdeteksi!");
        }
        System.out.println(angka + " bukan angka sial.");
    }

    public static void main(String[] args) {
        AngkaSial angkaSial = new AngkaSial();
        try {
            angkaSial.cobaAngka(10);
            angkaSial.cobaAngka(13);
            angkaSial.cobaAngka(5);
        } catch (AngkaSialException e) {
            System.out.println("Exception ditangkap: " + e.getMessage());
            System.out.println("hati-hati memasukkan angka!!!")
        }
    }
}

/*
 * PERTANYAAN:
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * jawab : Baris ini tidak akan dieksekusi jika angka adalah 13, karena exception dilempar sebelum mencapai perintah ini.
 * 
 * Apakah baris 21 pada AngkaSial.java di atas diekseskusi?
 * jawab: Tidak, karena program akan masuk ke catch ketika exception terjadi pada angka 13, sehingga baris ini tidak akan dijalankan.
 */