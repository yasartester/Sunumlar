package ders06_ifElseStatement;

import java.util.Scanner;

public class C02_ifStatements_Tekrari {
    public static void main(String[] args) {

        // Soru 4- kullanicidan bir ucgenin  3 kenar uzunlugunu alin,
        // ucgen eskenar ise "eskenar ucgen" yazdirin
        // ucgen eskenar degilse "eskeenar ucgen degil" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini ayri ayri giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 || kenar1==kenar3){
            System.out.println("Ucgen eskenar'dir");}
        else if (kenar1!=kenar2 || kenar2!=kenar3) {
            System.out.println("Ucgen eskenar degildir");

        }


    }
}
