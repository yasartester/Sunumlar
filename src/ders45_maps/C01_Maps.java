package ders45_maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {

        // Verilen bir cumlede kullanilan herbir harfi
        // ve o harfin kullanim miktarini
        // A=5 , b=3 ... gibi yazdirin

        String str= "Javayi balonu patlatmadan bitirelim";

        // J=1 , a=7, v=1 , y=1......

        String[] harflerArr=str.split("");
        // [J, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]

        Map<String,Integer> kullanimMiktariMap=new TreeMap<>();
        int sayac = 0;

        // 1- tum harfleri sirasi ile ele alacagiz
        for (int i = 0; i < harflerArr.length ; i++) {

            // 2- ele aldigimiz harfin, daha once map'e eklenip eklenmedigini kontrol edelim
            if (kullanimMiktariMap.containsKey(harflerArr[i])){
                continue;
            }else {
                // Kod buraya geldiyse o harf henuz map'e eklenmemistir.
                // o zaman bu harfin kullanim miktarini bulmaliyiz
                for (int j = i; j < harflerArr.length ; j++) {
                    if (harflerArr[j].equals(harflerArr[i])){
                        sayac++;
                    }
                }
                // sayma islemi bitti, Key ve Value'yu map'e ekleyelim
                kullanimMiktariMap.put(harflerArr[i],sayac);
                sayac=0;
            }

        }
        System.out.println(kullanimMiktariMap);
    }
}
