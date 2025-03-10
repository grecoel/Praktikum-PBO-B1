/*
 * File         : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran bernilai 0
 * Nama         : Gege Centiana Putra
 * Lab          : B1
 */


 /*
  * PERTANYAAN: secara konsep, ada yang kurang tepat pada program asersi2 di atas. Jelaskan!
  Jawaban:
  Asersi digunakan untuk mendeteksi kondisi yang seharusnya tidak mungkin terjadi dalam program yang sudah benar. 
  Namun, dalam program ini, asersi digunakan untuk validasi input, yang sebenarnya lebih baik ditangani dengan mekanisme 
  exception seperti if-else atau try-catch. Jika asersi dinonaktifkan saat runtime, input negatif tetap dapat masuk tanpa 
  ada validasi.
  Solusi: Gunakan pengecekan dengan if dan throw Exception untuk validasi input.
  */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class asersi 2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0): "Jari-jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran: "+kelilingLingkaran);
    }
}