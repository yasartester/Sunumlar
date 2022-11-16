package ders08_ternary_switch;

public class C05_NestedTernary {
    public static void main(String[] args) {

        // bir tamsayi belirleyin
        // Sayi pozitifse "cift sayi" veya "cift sayi degil" seceneklerinden uygun olani yazdirin
        // sayi pozitif degilse "3 basamakli"  veya  "uc basamakli degil" seceneklerinden uygun olani yazdirin.

        int sayi=-89;

        if (sayi>0){
            System.out.println(sayi%2==0 ? "cift sayi" : "cift sayi degil");}

        else {System.out.println(sayi>-1000 && sayi<-99 ? "sayi 3 basamakli" : "sayi 3 basamakli degil");}



        String sonuc= sayi>0
                ?
                sayi%2==0? "cift sayi" : "cift sayi degil"
                :
                sayi>-1000 && sayi<-99 ? "3 basamakli" : "3 basamakli degil";

        System.out.println(sonuc);










}}
