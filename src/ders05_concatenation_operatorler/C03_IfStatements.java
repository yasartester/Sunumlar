package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // kullanicidaniki tamsayi alin
        // eger birinci sayi 100 den buyukse , "ilk sayi 100'den buyuk" yazdirin.
        // eger ikinci sayi ciftse "ikinci sayi cift" yazdirin
        //  eger ilk sayi ikinci sayidan buyukse "ilk sayi daha buyuk" yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
           int sayi1= scan.nextInt();
           int sayi2= scan.nextInt();

        // eger birinci sayi 100 den buyukse , "ilk sayi 100'den buyuk" yazdirin.//
        if (sayi1>100){
            System.out.println("ilk sayi 100'den buyuk");
        }

        // eger ikinci sayi ciftse "ikinci sayi cift" yazdirin
        if (sayi2 %2==0){
            System.out.println("ikinci sayi cift");

            // eger ilk sayi ikinci sayidan buyukse "ilk sayi daha buyuk" yazdirin.
            if (sayi1>sayi2) {
                System.out.println("ilk sayi daha buyuk");}

            }





        }

//













    }
