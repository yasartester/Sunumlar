package ders17_scope;

public class C01_LocalVariables {
    public static void main(String[] args) {
        // bir variable icerisinde olusturulan variable'larin scope'u
        // icinde olusturulduklari method'dur
        // o method'un disindan ulasilamazlar

         int sayi=29;
        String isim= "Osman Said";
        //System.out.println(dogruMu);

        for (int i = 0; i <10 ; i++) {
            String adres = "Ankara";
            // bir loop icerisinde olusturulan variable yalnizca olustululdugu loop icerisinde gecerlidir
        }

        System.out.println(isim);
        System.out.println(sayi);
         // System.out.println(adres);    bir loop icerisinde olusturulan variable
                                       // yalnizca olusturuldugu loop icerisinde gecerlidir

        }
        public static void method1(){

            // System.out.println(sayi);
            // isim = "Canim Oglum";
            boolean dogruMu= true;
        }
      }