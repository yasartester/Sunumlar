package ders06_ifElseStatement;

import java.util.Scanner;

class C07_ifElseStatementguzel {
    public static void main(String[] args) {

        /* soru 5 kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise
        onu buyuk harf olarak yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);
        if (harf>=65 && harf<= 122){
        System.out.println("girilen harf : " +Character.toUpperCase(harf));}
        else
            System.out.println("harf girmediniz");}


    }