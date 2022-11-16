package ders03dataCastıngWrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="Java cok guzel";

        /* primitive data turleri
        sadece deger barindirirlar
        hazir metodlari yoktur
         */

        char krk='b';
        Character krkWrapper= 'c';
        krkWrapper.charValue();
        System.out.println(Character.isLetter('5')); // false
        System.out.println(Character.isDigit('7'));  // true

        String str1= "123";
        String str2= "12";
        System.out.println(str1 + str2); //12312
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); // 135
        // Integer.parsInteger(str) icine yazilan str rakamlardan olusuyorsa
        //  str'i int'a cevirir.
        // ancak bir karakter bile rakam degilse hata verir.

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE);  // -2147483648





    }
}
