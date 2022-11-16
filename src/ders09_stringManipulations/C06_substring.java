package ders09_stringManipulations;

public class C06_substring {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.substring(5));
        // 5. index ve sonrasini yazdirir ogren, isi kap (index 0'dan baslar)

        System.out.println(str.substring(0)); // 0'ıncı index'ten sonrasini
                                                       // yani hepsini yazdirir   Java ogren, isi kap
        System.out.println(str.length());  // 19 karakter var

        String sonharf= str.substring(str.length()-1);
        System.out.println(sonharf); // son harf olan kucuk p'yi yazdirir
        // veya
        sonharf="" +str.charAt(str.length()-1);
        System.out.println(sonharf);  // son harf olan kucuk p'yi yazdirir

        // simdi de son index'teki karakteri upperCase olarak yazdiralim
        System.out.println("Son harfi buyuk yazdirdik: "+sonharf.toUpperCase());//Son harfi buyuk yazdirdik: P
        System.out.println(str.substring(str.length()-1).toUpperCase());

        // son uc harfi buyuk harf olarak yazdiralim
        System.out.println(str.substring(str.length()-3).toUpperCase()); // KAP yazdirir








    }
}
