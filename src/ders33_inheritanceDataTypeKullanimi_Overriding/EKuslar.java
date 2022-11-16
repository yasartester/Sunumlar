package ders33_inheritanceDataTypeKullanimi_Overriding;

public class EKuslar extends DHayvanlar{

    protected void kanat(){
        System.out.println("Kuslar kanatlidirlar");
    }
    protected void solunum(){
        System.out.println("Kuslar akciger solunumu yaparlar");
    }
    protected void gaga(){
        System.out.println("Kuslar gagali hayvanlardir");
    }
    protected void cogalma(){
        System.out.println("Kuslar yumurta ile cogalirlar");
    }

}
