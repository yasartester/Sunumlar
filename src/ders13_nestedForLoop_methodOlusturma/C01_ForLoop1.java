package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C01_ForLoop1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Bir Cumle veya Kelime Giriniz");
        String cumle= scan.nextLine();

        for (int i= cumle.length()-1; i>=0; i--) {

            System.out.print(cumle.charAt(i)); }


        }

        }

