package ders36_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Deneme_exception {
    public static void main(String[] args) {

        // marketteki tum urunleri bir array'de tuttugumuzu varsayalim
        // kullaniciya index sorup, o index'teki urunu yazdiran
        // bir program hazirlayalim
        // Kullanici urun sayisindan buyuk bir index girerse
        // exception vermesinin onune gecelim.

        String[] urunler={"Cay","Seker","Cikolata","Sut","Bal","Kaymak"};

        Scanner scan;
        int istenenNo=0;
        boolean kontrol=true;

        while (kontrol){
            try {
                scan = new Scanner(System.in);
                System.out.println("istenen urunun sira numarasini giriniz: ");
                istenenNo = scan.nextInt();
                kontrol = false;
                System.out.println("Aradiginiz urun : "+urunler[istenenNo-1]);
            } catch(InputMismatchException deneme){
                System.out.println("Urun index'i icin bir tam sayi girmeniz gerekli");
            }

        }
        try {
            System.out.println("Aradiginiz urun : "+urunler[istenenNo-1]);
        } catch (ArrayIndexOutOfBoundsException err){
            System.out.println("Girdiginiz sira listemizde bulunmuyor"+
                    "\nSira numarasi en fazla : "+urunler.length+" olabilir.");
        }

    }
}
