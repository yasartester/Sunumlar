package ders04_matematikselIslemler_Increment_Decrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {

        // soru4- Kullanicidan iki double sayi alin,
        //  ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucunun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
            double sayi1= scan.nextDouble();
            double sayi2= scan.nextDouble();
         // System.out.println(sayi1/sayi2);  // bu haliyle yazdirilirsa sonuc ondalikli cikar

               int bolmeSonucuTamsayi=(int )( sayi1/sayi2);
               System.out.println(bolmeSonucuTamsayi); // 13/2=6 seklinde ondalikli kismi yazmaz







            }
}
