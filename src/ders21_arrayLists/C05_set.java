package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // list.set(index, yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur
        // ve o indexdeki degeri verdigimiz yeni deger olarak atar

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        // java'da set() method'lari update icin kullanilir
        // add() ile set() farklidir
        //  set() var olan bir elementi degistirir.

        sayilar.set(0,8);
        System.out.println(sayilar.set(2, 9)); // 4 (2. index'tekini 9 yapar) (eski degerini de yazdirir)
        System.out.println(sayilar);// [8, 2, 9, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]

        int eskiDeger= sayilar.set(1,9); // 1. index'teki 2'yi eski deger'e kaydedip, yeniyi p yapti.
        System.out.println(sayilar);  // [8, 9, 9, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]

        List<String> liste= new ArrayList<>();
        liste.add("ibo");
        liste.add("ramiz");
        liste.add("fahriye");
        liste.add("imran");

                   // liste.set(4,"yasar"); liste variable'i 0'dan basladigi icin 4. index yoktur.
                  //System.out.println("set'ten sonra liste : "+liste); IndexOutOfBoundsException

        liste.set(3,"yasar");
        System.out.println("set'ten sonra liste : "+liste);// set'ten sonra liste : [ibo, ramiz, fahriye, yasar]

    }
}
