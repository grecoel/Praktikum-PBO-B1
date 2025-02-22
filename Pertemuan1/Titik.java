// Gege Centiana Putra
// 24060123120024 Lab B1 Pemrograman Berorientasi Objek


public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;
    static int counterTitik;

    /* Behaviour/Method */
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //Mengubah nilai absis
    void setAbsis(double x){
        this.absis = x;
    }

    //Mengubah nilai ordinat
    void setOrdinat(double y){
        this.ordinat = y;
    }

    //Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y){
        absis += x;
        ordinat += y;
    }

    // Mencetak koordinat titik
    void printTitik(){
        System.out.println("(" + absis + ", " + ordinat + ")");
    }
    // 
    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        } else if(absis < 0 && ordinat > 0){
            return 2;
        } else if(absis < 0 && ordinat < 0){
            return 3;
        } else if(absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    //
    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2));
    }

    void refleksiX(){
        ordinat *= -1;
    }

    void refleksiY(){
        absis *= -1;
    }

    Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }
}
