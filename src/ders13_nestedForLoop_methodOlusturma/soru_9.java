package ders13_nestedForLoop_methodOlusturma;

public class soru_9 {
    public static void main(String[] args) {

        /* Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        String input="Java ne kadar guzel";
        // lezug ....
        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i)); } */

        // Kullanicidan bir string isteyin ve o string'i tersten yazdirin.

        String input= "gel edip , tahin ye";
        System.out.println(input.length()); // Bu cumle 18 karakter uzunlugundadir.
                                       // Son karakterden basa dogru yazdirmak istiyoruz.
                        // Ilk harf 0'inci karakterde, son harfimiz ise 18-1=17. karakterdedir.
                        // 17. karakter olan 'e' harfinden 0. karakter olan 'g' harfine kadar tersten yazdirir.
                        // "ey nihat , pide leg" yazdirir.

        for (int i = input.length()-1; i>=0 ; i--) {
            System.out.print(input.charAt(i));}

    }
}
