package ders06_ifElseStatement;

import java.util.Scanner;

public class C08_ifElseStatement {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not>=85){
            System.out.println("Notunuz AA");}
        else if (not>= 65){
            System.out.println("Notunuz BB");}
        else if (not>=50){
            System.out.println("Notunuz CC");}
        else {
            System.out.println("Notunuz DD");

        }








    }
}
