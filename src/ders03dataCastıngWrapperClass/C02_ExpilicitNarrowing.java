package ders03dataCastıngWrapperClass;

public class C02_ExpilicitNarrowing {
    public static void main(String[] args) {

        int sayi=20;
         /* short sh= sayi; bu durumda java atama yapmaz
         dar data turundeki degeri genis e atama yapmaz
         sorumlulugun kullanici tarafindan alinmasini ister
          */
        //int sayi=(short)20;  // bu haliyle kabul eder
        //System.out.println(sh);

        double dbl =23.5;
        //  int say= dbl; // bu nu da kabul etmez
        int say=(int) dbl;

    }
}
