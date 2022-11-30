package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotsayisi {

    public static void main(String[] args) {

        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den buyuk bir sayi girip, bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

       // List<Double> notlar= listeOlustur();

    }

    public static void raporla(List<Double>notlar){

        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        int ogrenciSayisi=notlar.size();
        double notlarToplami= 0.0;
        double sinifNotOrtalamasi=0.0;
        int ortUstuOgrenciSayisi= 0;
                // Notlar toplamini bulalim

        for (int i = 0; i <notlar.size() ; i++) {
            notlarToplami+=notlar.get(i);

        }

        // not ortalamasini bulalim
            sinifNotOrtalamasi= notlarToplami/ogrenciSayisi;

        // ortalamanin ustundeki ogrenci sayisini bulalim
        for (int i = 0; i <notlar.size() ; i++) {
            if (sinifNotOrtalamasi<notlar.get(i)){
                ortUstuOgrenciSayisi++;
            }

        }
        /* rapor icin istenenleri yazdiralim
        System.out.println("Girilen not sayisi : "+ogrenciSayisi+
                "\nG'r'len notlarin ortalamasi : "+sinifNotOrtalamasi+
                );  */

    }

}
