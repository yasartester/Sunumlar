package ders09_stringManipulations;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {

        String str= "Java Mutluluktur";
        System.out.println(str.toUpperCase());  // buyuk harf (gecici olarak) yazdirir==> JAVA MUTLULUKTUR
        System.out.println(str);  // atama yapilmadigindan eskisi gibi yazdirir==> Java Mutluluktur

        str= str.toUpperCase(); // bu sekliyle atama yapilmis olup
                                // bundan sonra hep buyuk harf yazdirir==> AVA MUTLULUKTUR
        System.out.println(str);
        System.out.println("buyuk harfle: "+ str);

        str= "ince mehmet";
        str= str.toUpperCase();  // ingilizce olarak buyuk yazar
        System.out.println(str);  // INCE MEHMET

        // str= str.toLowerCase();
        // System.out.println(str);  // ince mehmet

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // "ınce mehmet" diye
                                                                         // Türkçe'ye cevirdi










    }
}
