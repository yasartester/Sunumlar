package ders03dataCastıngWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        /* kullanicidan bir tamsayi alin
        kullanici kac girerse girsin
        konsolda -128 ile +127 arasinda bir sonuc yazdiracak
        kod yaziniz
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilensayi= scan.nextInt();
         byte donusensayi=(byte) girilensayi;
         System.out.println("girdiginiz "+ girilensayi +"`nin donusmus hali" + donusensayi);







    }
}
