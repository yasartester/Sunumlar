package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // Iterator=  bir interface'dir direct obje uretilemez
        Iterator itr1= sayilar.iterator();

        // tum elementleri iterator kullanarak yazdiralim
        System.out.println(itr1.hasNext()); // true
        System.out.println(itr1.next());

    }
}
