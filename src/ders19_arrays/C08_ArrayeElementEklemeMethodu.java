package ders19_arrays;

import java.util.Arrays;

public class C08_ArrayeElementEklemeMethodu {
    public static void main(String[] args) {

        // verilen bir int array'e istenilen bir elementi ekleyip
        // yeni halini bize donduren bir method olusturun.

        int[] abc= {3,5,8,9,6,7,3,4};
        int ekleneceksayi=10;

            abc=arrayeElemanEkle(abc,ekleneceksayi);
        System.out.println(Arrays.toString(abc)); // [3, 5, 8, 9, 6, 7, 3, 4, 10]


    }

    public static int[] arrayeElemanEkle(int[] eklenecekArr, int ekleneceksayi) {
        int[] yeniArr= new int[eklenecekArr.length+1];
        for (int i = 0; i <eklenecekArr.length ; i++) {
            yeniArr[i]=eklenecekArr[i];
        }
        yeniArr[yeniArr.length-1]= ekleneceksayi;


        return yeniArr;
    }







}
