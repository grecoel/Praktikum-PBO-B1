/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionGenerikB;

/**
 *
 * @author ACER
 */
public class Lingkaran extends BangunDatar{
    //atribue
    private double jejari;
    
    //konstruktor
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    //selektor
    public double getJejari(){
        return jejari;
    }
    
    //mutator
    public void setMutator(double jejari){
        this.jejari = jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
    
    @Override
    public double hitungLuas(){
        return 3.14*jejari*jejari;
    }
}
