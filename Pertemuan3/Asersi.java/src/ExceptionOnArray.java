/*
 * File         : ExceptionOnArray.java
 * Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
 * Nama         : Gege Centiana Putra
 * Lab          : B1
 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[5]); // Indeks di luar batas
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kesalahan: Indeks di luar batas array.");
        }
    }
}
