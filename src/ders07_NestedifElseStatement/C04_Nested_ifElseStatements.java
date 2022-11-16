package ders07_NestedifElseStatement;

import java.util.Scanner;

public class C04_Nested_ifElseStatements {
    public static void main(String[] args) {
        // soru 1- kullanicidan cinsiyetini ve yasini alin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin");
        double yas = scan.nextDouble();
        System.out.println("Lutfen cinsiyetinizi giriniz   E/K");
        char cinsiyet = scan.next().charAt(0);

        if (yas < 15) {
            System.out.println("Hatali giris");
        } else if (yas < 60) {
            // emekli olamaz calismasi gereken sure cinsiyetle ilgili
            System.out.println("Emekli olamazsin");

            if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println("Daha " + (60 - yas) + " yil calismalisin");
            } else if (cinsiyet == 'E' || cinsiyet == 'e') {
                System.out.println("daha " + (65 - yas) + " yil calismalisin");

            } else {
                System.out.println("gecersiz giris");
            }
        } else if (yas < 65) {
            // kadin ise emekli olabilir, erkek ise calismasi lazim
            if (cinsiyet == 'K' || cinsiyet == 'k')
            {
                System.out.println("Emekli olabilirsin");
            } else if (cinsiyet == 'E' || cinsiyet == 'e')
            {
                System.out.println("emekli olmak icin " + (65 - yas) + " yil calismalisin");
            } else

                System.out.println("hatali cinsiyet girisi");
            } else { // yas 65'ten buyukse
                System.out.println("emeklisin");}
        }
    }

