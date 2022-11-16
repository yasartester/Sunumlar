package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_indexOf {
    public static void main(String[] args) {

                int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
                List<Integer> sayilar= new ArrayList<>();

                for (int i = 0; i < arr.length ; i++) {
                    sayilar.add(arr[i]);
                }

        System.out.println(sayilar.indexOf(2)); // 1  (2'nin kacinci index'te oldugunu verir)

        System.out.println(sayilar.lastIndexOf(5)); // 15 (en sondaki 5'in kacinci index'te oldugunu verir


            }
        }