package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};

        // list.set(index, yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur
        // ve o indexdeki degeri verdigimiz yeni deger olarak atar

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        sayilar.remove(2); // [1, 2, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]
        System.out.println(sayilar); // 2. index'teki 4 silindi
        //liste integer'lardan olusuyorsa remove ile istenen sayiyi degil index'teki degeri silebilir

        Integer silinecekObje=4;
        sayilar.remove(silinecekObje); // bu sekilde listedeki istenen ilk objeyi siler
        System.out.println(sayilar);

        //istenen objeyi tum listeden silmek icin
        silinecekObje=3;

       while (sayilar.remove(silinecekObje)){
                   // while(sayilar.contains(silinecekObje)){
                  //            sayilar.remove(silinecekObje);   seklinde de yazilabilir

           silinecekObje=10;
           System.out.println(sayilar.remove(silinecekObje)); // false (10 diye bir obje olmadigi icin)
    }
        System.out.println(sayilar); // butun 3'leri siler [1, 2, 5, 5, 2, 5, 1, 2, 5, 4, 5]

        sayilar.remove(20); // IndexOutOfBoundsException (20. index olmadigi icin)


}}
