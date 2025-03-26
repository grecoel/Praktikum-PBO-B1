/**
 * Nama File        : Mahasiswa.java
 * Deskripsi        : Class untuk merepresentasikan mahasiswa dalam universitas
 * Pembuat          : Gege Centiana Putra
 * NIM              : 24060123120024
 * Tanggal Pembuatan: 25 Maret 2025
 */

 public class Mahasiswa extends CivitasAkademika {
    // Attribut
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static int counter = 0;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        super();
        this.NIM = "";
        this.semester = 0;
        this.fakultas = new Fakultas();
        counter++;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    // Selektor
    public String getNIM() { 
        return NIM; 
    }

    public int getSemester() { 
        return semester; 
    }

    public Fakultas getFakultas() { 
        return fakultas; 
    }

    // Mutator
    public void setNIM(String NIM) { 
        this.NIM = NIM; 
    }

    public void setSemester(int semester) { 
        this.semester = semester; 
    }

    public void setFakultas(Fakultas fakultas) { 
        this.fakultas = fakultas; 
    }

    // Method
    public double hitungUKT() {
        double uktAwal = fakultas.getTarifUKT();
        return uktAwal * Math.pow(0.95, semester - 1);
    }

@Override
public void printInfo() {
    System.out.println("===Informasi Mahasiswa===");
    System.out.println("Nama: " + getNama());
    System.out.println("Email: " + getEmail());
    System.out.println("NIM: " + NIM);
    System.out.println("Semester: " + semester);
    System.out.println("Fakultas: " + fakultas.getNama());
    System.out.println("UKT: Rp " + String.format("%.2f", hitungUKT()));
}

    public static int getCounter() { 
        return counter; 
    }
}