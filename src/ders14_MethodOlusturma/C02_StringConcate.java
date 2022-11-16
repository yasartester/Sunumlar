package ders14_MethodOlusturma;

public class C02_StringConcate {
    public static void main(String[] args) {
        // verilen iki String'i parametre olarak kabul edip
        // bu iki String'i aralarinda bir bosluk olan tek bir String olarak
        // main method'a donduren bir method olusturun

        String str1="Java";
        String str2="candir";

        System.out.println(birlestirMethodu(str1,str2));
        System.out.println(birlestirMethodu("Bu da","gecer")); // Bu da gecer
        System.out.println(birlestirMethodu("Anladiniz","mi")); // Anladiniz mi


    }
public static String birlestirMethodu(String str1, String str2){
        return str1+" "+str2;

}

}
