package ders06_ifElseStatement;

import java.util.Scanner;

public class C07__ifElseStatement {
    public static void main(String[] args) {

        /* soru 5 kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise
        onu buyuk harf olarak yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char hrf= scan.next().charAt(0);
        if (hrf>='a' && hrf<='z'){ // kucuk harf girildi demektir
            System.out.println(("Girilen harf : ") +(char) (hrf-32));}
           else {
            System.out.println("Girilen harf : "+hrf);
        } // Character.toUpperCase("Girilen harf : " hrf); de aynisini yapar
        }


    }
