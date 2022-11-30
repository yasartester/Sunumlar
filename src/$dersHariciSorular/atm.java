package $dersHariciSorular;

import java.util.Scanner;

public class atm {

         final static String kartNo="1234567890123456";
         static Scanner scan=new Scanner(System.in);
         static String sifre="1234";
         static double bakiye=20000;

    public static void main(String[] args) {
        giris();
    }

    private static void giris() {
        System.out.println("Lutfen kart numaranizi giriniz: ");
        String kKartNo= scan.nextLine();
        System.out.println("Ltfen sifrenizi giriniz: ");
        String kSifre= scan.next();
        kKartNo=kKartNo.replaceAll("\\s",""); // kart no'daki bosluklari hiclikle degistir

        if (kSifre.equals(sifre)&&kKartNo.equals(kartNo)){
            menu();
        }
    }

    private static void menu() {
        System.out.println("******JAVABANK'A HOS GELDINIZ******\n" +
                "1. BAKIYE SORGULAMA\n" +
                "2. PARA YATIRMA\n" +
                "3. PARA CEKME\n" +
                "4. PARA GONDERME\n" +
                "5. SIFRE DEGISTIRME\n" +
                "6. CIKIS");

        int secim= scan.nextInt();
        switch (secim){
            case 1 : {bakiyeSorgula();}
            case 2 : {
                System.out.println("YATIRILACAK MIKTARI GIRINIZ: ");
                double miktar= scan.nextDouble();
                paraYatirma(miktar);}
            case 3 : {
                System.out.println();
                paraCekme();}
            case 4 : {}
            case 5 : {}
            case 6 : {}
        }
    }

    private static void paraCekme() {
    }

    private static void paraYatirma(double miktar) {
        bakiye+=miktar;
        bakiyeSorgula();
        menu();
    }

    private static void bakiyeSorgula() {
        System.out.println("BAKIYENIZ: "+bakiye);
        menu(); // bakiye sorgusundan sonra farkli islemler icin menu() methoduna donmek icin menu() yazdik.

    }

}
