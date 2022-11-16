package ders12_forLoops;

public class C02_ForLoops {
    public static void main(String[] args) {


        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" "); // 1 2 3 4 5 6 7 8 9 10   yzdirir
        }

        System.out.println(""); // araya bos satir birakir

        // 2 basamakli sayilardan 7 ile bolunebilenleri yan yana yazdirin

        for (int i = 10; i <100 ; i++) {
            if (i%7==0)
                System.out.print(i+" "); //14 21 28 35 42 49 56 63 70 77 84 91 98

        }

        System.out.println("");

        // 13'den baslayip, 100'e kadar  7'ser 7'ser artirip yazdiralim
        for (int i = 13; i <=100 ; i+=7) {
            System.out.print(i+" "); // 13 20 27 34 41 48 55 62 69 76 83 90 97
        }
        System.out.println(" ");

        // birden 10'a kadar (sinirlar dahil) sayilarin karelerini alip yazdirin
        for (int i = 1; i <=10 ; i++) {
            int kare = i * i;
            System.out.print(kare+" "); // 1 4 9 16 25 36 49 64 81 100

        }
        System.out.println("");

        for (int i = 10; i <=15 ; i++) { // 10 ile 15 arasindaki (sinirlar dahil) sayilarin karesini alir
            int kare= i*i;
            System.out.print(kare+" "); // 100 121 144 169 196 225

        }













    }
}
