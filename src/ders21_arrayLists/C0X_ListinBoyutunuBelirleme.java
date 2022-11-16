package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C0X_ListinBoyutunuBelirleme {
    public static void main(String[] args) {
       // list.size() Method'u bize list'in boyutunu dondurur

        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar.size()); // su anki size 0'dir

        sayilar.add(10);
        sayilar.add(20);
                // System.out.println(sayilar); [10, 20]  bu bize listedeki elementlerin listesini verir

        System.out.println(sayilar.size()); // 2  list'in size'i (boyutu)

    // List'in bos olup olmadigini kontrol etme  ( list.isEmpty() )
        List<Integer> bilgiler= new ArrayList<>();
        System.out.println(bilgiler.isEmpty());// true  (bilgiler list'i bos oldugu icin bosMu sorusuna true yazdirdi
        System.out.println(!bilgiler.isEmpty()); // false (bos degil mi? sorusuna false yazdirdi)

        bilgiler.add(10);
        bilgiler.add(20);
        System.out.println(bilgiler.isEmpty()); // false ( bilgiler list'inde 10 ve 20 oldugu icin
                                                // bos mu sorusuna false yazdirdi




    }
}
