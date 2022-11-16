package ders08_ternary_switch;

public class C03_Ternary {
    public static void main(String[] args) {
        int a=5;
        // Ternary operatoru tek basina kullanilamaz
        // Ternary bize bir sonuc verir
        // bu sonucu ya direkt yazdirmali ya da bir variable'a atamaliyiz

        System.out.println(a%2==0 ? "cift sayi" : "Tek sayi"); // bu haliyle direkt yazdirir

        String sonuc= a%2==0 ? "cift sayi" : "tek sayi";
        /* ternary'nin sonucunu bir variable'a atayacaksak
         true ve false durumlarinda uretilecek sonucun
         ayni data turune uygun olmasi gerekir
         aksi taktirde CTE olusur.

          fakat ternary'yi sout icinde kullanirsak
           sonuclarin data turunun ayni olmasi sart olmaz */

        String sonuc2= a>10 ? "buyuk sayi" :""+ 2*a ;  // CTE vermemesi icin String'e cevirdik.
        System.out.println(sonuc2);
        System.out.println(a>10 ? "buyuk sayi" : 2*a);
        //sout icinde kullanirsak sonuclarin data turunun ayni olmasi sart olmaz



    }
}
