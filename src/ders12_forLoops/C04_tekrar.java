package ders12_forLoops;

public class C04_tekrar {
    public static void main(String[] args) {
        // verilen sayinin rakamlar toplamini bulunuz

        int sayi=34;
        String sayiStr=""+sayi;
        int rakamlarToplami=0;
        int birlerBasamagi=0;

        for (int i = 1; i <=sayiStr.length() ; i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplami=birlerBasamagi+rakamlarToplami;
            sayi=sayi/10;

        }
        System.out.println("Rakamlar Toplami : "+rakamlarToplami);

         }
}
