package ders19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        int[] arr= {2,4,6};
        // bu arr'e 4. bir element olarak 8 ekleyelim

        /* var olan bir arr'e fazladan bir eleman eklenemez
            ama yeni deger atanabilir
           once int[] arr2= [2,4,6,8] seklende yeni bir array olusturup
                sonra arr2 degerini arr1'e atayabiliriz */
        int[] arr2= new int[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {

            arr2[i] =arr[i]; }
        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 0]
    // arr  array'ine yeni olusturdugumuz arr2 array'ini atayacagiz.
        arr=arr2;
        System.out.println("arr'nin son hali : "+Arrays.toString(arr));
        // arr'nin son hali : [2, 4, 6, 0]



    }
}
