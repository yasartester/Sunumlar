package ders07_NestedifElseStatement;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        // kullanicinin kilo(kg) ve boyunu cm isteyipvucut kitle endeksini hesaplayin
        // (kilo*10000/(boy*boy))
        // endeksi 30 dan buyukse  obez
        // 25-30 arasi kilolu
        // 20-25 arasi normal
        // 20'den kucukse zayif yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        double agirlik=scan.nextDouble();
        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();

        double vke= (agirlik*10000 / (boy*boy));
        System.out.println("Vucut kitle endeksiniz : "+vke);

        if (vke>30) {
            System.out.println("Obez");
        } else if (vke>25) {
            System.out.println("kilolu");
        } else if (vke>20) {
            System.out.println("normal");
        } else if (vke>0) {
            System.out.println("Zayif");
        } else{
            System.out.println(" Yanlis Giris");

        }

    }

    }









