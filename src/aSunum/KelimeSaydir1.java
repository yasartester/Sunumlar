package aSunum;

import java.util.Scanner;

public class KelimeSaydir1 {
    public static void main(String[] args) {

        // Kullanicidan Bir cumle aliniz
        // verilen cumlede kac adet kelime bulundugunu hesaplayan bir kod yaziniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        int sayac=1;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)== ' ') {
                sayac++;
            }

        }
        System.out.println("Girdiginiz cumlede "+sayac+" adet kelime bulunmaktadir");

    }


}
