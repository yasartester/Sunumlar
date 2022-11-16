package ders08_ternary_switch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        // kullanicidan bir sayi alin
        // sayi pozitif ise iki katini yazdirin
        // sayi pozitif degilse 10  fazlasini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi*2);}
        else {
            System.out.println(sayi+10);}
        System.out.println(sayi>0 ? sayi*4 : sayi+40);




    }
}
