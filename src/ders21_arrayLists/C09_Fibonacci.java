package ders21_arrayLists;

import java.util.Scanner;

public class C09_Fibonacci {

        public static void main(String[] args) {

            Scanner scan= new Scanner(System.in);
            System.out.println("Please enter a sentence\n ");
             String cumle= scan.nextLine();
             int sayac=1;

            for (int i = 0; i <cumle.length() ; i++) {
                if (cumle.charAt(i)==' '){
                    sayac++;
                }

            }
            System.out.println(sayac);

    }
}
