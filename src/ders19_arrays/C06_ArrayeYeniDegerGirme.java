package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayeYeniDegerGirme {
    public static void main(String[] args) {

        String str="Java";
        str="hava";
        System.out.println(str); // hava
        /* var olan bir aray'in uzunlugu degistirilemez
           ama varolan bir array'e yeni bir array degeri atanabilir */

        // 1- var olan bir array'i yeni deger olarak atayabiliriz

        String [] arr1= {"Ali","Veli"};
        String[] arr2= {"A","B","C"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1)); // [A, B, C]

        // 2- istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz
        arr1=new String[6];
        System.out.println(Arrays.toString(arr1)); //[null, null, null, null, null, null]

        // 3- yeni olusturulan bir array'e { } icinde deger yazarak atama yapabiliriz
        //arr1={"g","h"};  OLMAZ
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11}; // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        System.out.println(Arrays.toString(arr));


    }
}
