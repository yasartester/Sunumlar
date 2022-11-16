package ders15_overloading_whileLoop;

public class C01_Overloading {
    public static void main(String[] args) {
        String str= "JavA ogrendik, siradaki gelsin";
        System.out.println(str.startsWith("a",3)); // true  (3. index a ile mi basliyor)
        System.out.println(str.startsWith("A",3)); // false (3. index A ile mi basliyor)
        /*
          Bir class'da ayni isimde ama farkli signature'a sahip method'lar olusturulmasina
          method overloading denir.
         */
    }
}