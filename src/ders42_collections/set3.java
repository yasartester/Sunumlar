package ders42_collections;

import java.util.HashSet;
import java.util.Set;

public class set3 {
    public static void main(String[] args) {

        int[] arr={2,3,5,3,6,7,4,8,9,0,8,6,5,8,0,5};

        Set<Integer> geciciSet= new HashSet<>();

        for (Integer each: arr){
            geciciSet.add(each);
        }
        int[] geciciArr=new int[geciciSet.size()];
        int index=0;
        for (Integer each:geciciSet
             ) {
            geciciArr[index]=each;
            index++;
        }
        arr=geciciArr;
        System.out.println();
    }
}
