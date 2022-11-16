package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C03_tekrari {
    public static void main(String[] args) {

        // kullanicidaniki tamsayi alin
        // eger birinci sayi 100 den buyukse , "ilk sayi 100'den buyuk" yazdirin.
        // eger ikinci sayi ciftse "ikinci sayi cift" yazdirin
        //  eger ilk sayi ikinci sayidan buyukse "ilk sayi daha buyuk" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1 > 100) {
            System.out.println("ilk sayi 100'den buyuktur");}
        if (sayi2 %2==0){
            System.out.println("ikinci sayi cifttir");}
        if (sayi2<sayi1){
            System.out.println("ilk sayi daha buyuktur");


        }
    }}
