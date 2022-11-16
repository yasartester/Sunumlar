package ders08_ternary_switch;

public class Test_01 {
    public static void main(String[] args) {
        // verilen uc basamakli bir sayiyi yazi ile yazdirin

        String[] birler= new String[] {"", "bir","iki","uc","dort","bes","alti","yedi","sekiz","dokuz"};
        String[] onlar= new String[] {"","on","yirmi","otuz","kirk","elli","altmis","yetmis","seksen","doksan"};
        String[] yuzler= new String[] {"","yuz","iki yuz","uc yuz","dort yuz","bes yuz",
                                       "alti yuz","yedi yuz","sekiz yuz","dokuz yuz"};

            int sayi=534;

            int birlerBasamagi= sayi%10;
            int onlarBasamagi= sayi%100 /10;
            int yuzlerBasamagi= sayi%1000/100;

            String yazi= yuzler[yuzlerBasamagi]+" "+ onlar[onlarBasamagi]+" "+birler[birlerBasamagi];


        System.out.println("yazi ile: " +yazi);








    }
}
