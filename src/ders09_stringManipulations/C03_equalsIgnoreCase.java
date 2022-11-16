package ders09_stringManipulations;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        String str3="ALI";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1.equalsIgnoreCase("Ali ")); // false   cunku bosluk kullanilmis
                                                                     // bosluk olmasa true sonucunu verirdi
        /* equalsIgnoreCase  ayni metnin buyuk kucuk harf kullanilarak olusturulan
         farkli yazimlarini birbirine esit olarak kabul eder
                yani equalsIgnoreCase icin  ali, Ali, ALI, aLi, alI  birbirine esittir.
                ama kelimede bosluk veya noktalama isaretleri gibi farklilik varsa  bunlari tolere etmez

                a li   ile  ali birbirine esit
                Al,i   ile  Ali birbirine esit degildir  */






    }
}
