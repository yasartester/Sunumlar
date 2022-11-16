package ders08_ternary_switch;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        // ucgen eskenar ise "Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 && kenar1==kenar2 &&
                kenar1==kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil");





    }
}
