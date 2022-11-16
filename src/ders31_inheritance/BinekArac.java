package ders31_inheritance;

public class BinekArac extends Arac {

    protected String marka= "Binek araclar farkli markalara sahip olabilir";
    protected String model= "Binek araclar farkli modellerde olur";
    protected int yil= 1900;

    protected void hiz(String yakit){
        System.out.println("Binek araclarin hizi modele gore degisir");
    }
    protected void teker(){
        System.out.println("Binek araclarin 4 tekeri olur");
    }
}
