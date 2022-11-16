package ders08_ternary_switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        // J : Java
        // D : Devolepment
        // K : Kit
        // Kullanicidan bir harf alin
        // alinan harf  J , D ,K  harflerinden biri ise yukaridaki kelimelerden uygun olani yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        switch (harf){
            case 'j':
            case 'J':
                System.out.println("Java");
                break;
            case 'd':
            case 'D':
                System.out.println("Devolempment");
                break;
            case 'k':
            case 'K':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Gecersiz harf");


        }






    }
}
