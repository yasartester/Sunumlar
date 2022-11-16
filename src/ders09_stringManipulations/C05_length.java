package ders09_stringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str= "Uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.length()); // karakter sayisini verir(index karakterden 1 eksiktir)  34 karakter

        // son karkteri elde etmek icin [length() - 1] yazdiririz
        System.out.println(str.length()-1); // charAt kullanilmadigi icin harf degil sayi yazdirir  34-1=33
        System.out.println(str.charAt(str.length()-1)); // son karakter olan " u " yu yazdirir.

        System.out.println(str.charAt(str.length()-3));  // sondan ucuncu karakteri yazdirir  " g "





    }
}
