package ders04_matematikselIslemler_Increment_Decrement;

import java.util.Scanner;

public class C04_RakamlarToplami_Modulus2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int input= scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        // 1- birler basamagini al
        birlerBasamagi = input % 10; // 3
        //2- birler basamagini rakamlar toplamina ekle
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        // 3- birler basamagindan kurtul
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        input = input/10;

        System.out.println("Verilen sayinin rakamlar toplami: " + rakamlarToplami);












    }
}
