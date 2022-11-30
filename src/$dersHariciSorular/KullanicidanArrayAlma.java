package $dersHariciSorular;

import java.util.Scanner;

public class KullanicidanArrayAlma {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String[] isimler= new String[4];

        for (int i = 0; i <isimler.length ; i++) {
            System.out.println((i+1)+". ismi giriniz: ");
            isimler[i]=scan.nextLine();
        }
        System.out.println("");
        for (int i = 0; i < isimler.length ; i++) {
            System.out.println((i+1)+". isim : "+isimler[i]);

        }

        }
    }

