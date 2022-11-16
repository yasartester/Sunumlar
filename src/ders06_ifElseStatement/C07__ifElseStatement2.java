package ders06_ifElseStatement;

import java.util.Scanner;

public class C07__ifElseStatement2 {
    public static void main(String[] args) {

        /* soru 5 kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise
        onu buyuk harf olarak yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char hrf= scan.next().charAt(0);
        System.out.println(("Girilen harf : ")+ Character.toUpperCase(hrf));
    }


}
