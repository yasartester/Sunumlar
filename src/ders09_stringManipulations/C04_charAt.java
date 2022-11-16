package ders09_stringManipulations;

public class C04_charAt {
    public static void main(String[] args) {

        String str= "Java Candir";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));   // ilk index 0(sifir) oldugu icin 5. index C olur
        System.out.println(str.charAt(10)); // 10. index 11. karakteri yazdirir  yani r yazdirir
        System.out.println(str.length());  // bu formul metindeki karakter sayisini verir
                                          // bu kelimede 11 karakter vardir ama max index 10'dur
                                         // bir metindeki karakter sayisi indexten 1 fazla olur





    }
}
