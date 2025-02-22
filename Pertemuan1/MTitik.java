// Gege Centiana Putra
// 24060123120024 Lab B1 Pemrograman Berorientasi Objek

public class MTitik {
    public static void main(String[] args) {
        System.out.println("===========Membuat Objek Titik===========");
        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        Titik T3 = new Titik();
        Titik T4 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        
        //Membuat titik T2
        Titik T2 = T1;
        T2.setAbsis(10);
        T2.setOrdinat(10);
        T2.printTitik();
        System.out.println("Counter Titik: " + Titik.counterTitik);

        System.out.println("T1 berada pada kuadran: "+ T1.getKuadran());
        System.out.println("T2 berada pada kuadran: "+ T2.getKuadran());

        System.out.println("jarak T1 ke pusat: " + T1.getJarakPusat());
        System.out.println("jarak T2 ke pusat: " + T2.getJarakPusat());

        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

        System.out.println("T1 Sebelum direfleksi");
        T1.printTitik();
        T1.refleksiX();
        System.out.println("Titik T1 setelah direfleksikan terhadap sumbu X:");
        T1.printTitik();

        System.out.println("T2 Sebelum direfleksi");
        T2.printTitik();
        T2.refleksiY();
        System.out.println("Titik T2 setelah direfleksikan terhadap sumbu Y:");
        T2.printTitik();

        System.out.println("Membuat T4 yang merupakan titik baru hasil refleksi T1");
        T4 = T1.getRefleksiX();
        T4.printTitik();
        
        System.out.println("Membuat T3 yang merupakan titik baru hasil refleksi T2");
        T3 = T2.getRefleksiY();
        T3.printTitik();
    }
}
