package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] arr={"Ali","Ulus","Nesrin"};

        // bu array'in tum elementlerini aralarinda birer boslu birakarak yazdirin

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]+" ");  // Ali Ulus Nesrin  diye yazdirir
        }

        // bu array'i array olarak yazdiralim

        System.out.println(arr ); // array bir obje non-primitive data turu oldugundan java referansini yazdirir
          // array' i array olarak yazdirmak istiyorsak Java'dan Arrays class'indan yardim almaliyiz
        System.out.println(Arrays.toString(arr)); //  [Ali, Ulus, Nesrin]
        // Array'in tum elemanlarina ulasmak istersek for loop kullaniriz




    }
}
