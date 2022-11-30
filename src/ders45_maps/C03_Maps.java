package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim
        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }
         */


        String subeAdi = "H";
        MapDepo.subeOgrenciBilgileriniYazdir(ogrenciMap, subeAdi);

    }
}