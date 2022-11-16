package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        System.out.println(sayilar); //[]
        sayilar.add(14); // listeye  10  ekleyecek
        System.out.println(sayilar.add(10)); // true  (listede  10 eklendi mi, anlamindaki ifadeye
                        //  true veya false yanitini verir
        System.out.println(sayilar); // [14, 10] yazdirir

        sayilar.add(20);
        System.out.println(sayilar); // [14, 10, 20]  tersi soylenmedikce elementi sona ekler

        sayilar.add(1,15);
        System.out.println(sayilar); // [14, 15, 10, 20]  birinci index'e (14 ile 10 arasina) 15 ekledi

                // listenin basina 98 ekleyin
        sayilar.add(0,98);
        System.out.println(sayilar); //[98, 14, 15, 10, 20]


        List<Integer> eklenecekListe= new ArrayList<>();
                 eklenecekListe.add(3);
                 eklenecekListe.add(5);
            // sayilar listesinin sonuna eklenecekListe'yi ekleyin
        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar); // [98, 14, 15, 10, 20, 3, 5]

            // sayilar listesinin basindaki 98' den sonraya eklenecekListe'yi ekleyin
        sayilar.addAll(1,eklenecekListe);
        System.out.println(sayilar);//[98, 3, 5, 14, 15, 10, 20, 3, 5] 3 ve 5 rakamlari 0. index'ten sonraya da eklendi





    }
}
