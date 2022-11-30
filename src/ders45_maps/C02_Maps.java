package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim
        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
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

        Set<Integer> ogrenciKeySet=ogrenciMap.keySet(); // bir map'deki key'leri set olarak dondurur
        System.out.println(ogrenciKeySet); // [101, 102, 103, 104, 105, 106]
        Collection<String> OgrenciValueCollection =ogrenciMap.values(); // Bir map'deki tum valu'leri b'ze dondurur

        System.out.println(OgrenciValueCollection);
                /*
                [Ali-Can-10-H-MF,
                Veli-Cem-11-M-Soz,
                Ali-Cem-11-H-TM,
                Ayse-Can-10-H-MF,
                Ayse-Cem-11-M-TM,
                Fatma-Han-10-K-Soz]
                 */
        System.out.println(OgrenciValueCollection.size());// 6



    }
}
