package ders04_matematikselIslemler_Increment_Decrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

          // kullanicidan iki int deger alin
          // bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("sonuc : " + sayi1/sayi2); // sonuc : 3 virgulden sonrasini almaz

        double ondalikliSonuc= (sayi1/sayi2);
        System.out.println(ondalikliSonuc); //  20/6=243.0  sonucunu verir.
        // cunku verilen sayilardan birinin double olmasi gerekli

        double dogruSonuc = (double) sayi1 /(sayi2);  // double/int ==> genis olana gore sonuc verir.
        System.out.println(dogruSonuc);













    }
}
