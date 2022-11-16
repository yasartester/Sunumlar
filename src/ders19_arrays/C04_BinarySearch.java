package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        int[] arr= {1,8,3,7,2,5,8,1};
        System.out.println(Arrays.binarySearch(arr, 8)); // 6 (altinci index'tek' 8'i verir)
        System.out.println(Arrays.binarySearch(arr,5)); // -2 (5'i bulamadi)
        System.out.println(Arrays.binarySearch(arr,1)); // 0
        System.out.println(Arrays.binarySearch(arr,9)); // -10 (9 rakami olmadigi halde bu sonucu verdi)
        /*
            Binary search method'unun dogru sonuclar verebilmesi icin
            oncelikle sort() methodu kullanilmalidir.

            sort() kullanmadan binary search ile yapilan arama dogru veya yanlis cevap verebilir
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 1, 2, 3, 5, 7, 8, 8]

        System.out.println(Arrays.binarySearch(arr, 8)); // 6
        System.out.println(Arrays.binarySearch(arr,5)); //  4
        System.out.println(Arrays.binarySearch(arr,1)); // 1
        System.out.println(Arrays.binarySearch(arr,9)); // 8

    }
}
