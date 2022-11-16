package ders12_forLoops;
public class C04_RakamlarToplmi {
    public static void main(String[] args) {
        // kullanicinin verdigi sayinin rakamlar toplamini bulun

        int sayi= 430112388;
        String sayiStr=""+sayi;

       int rakamlarToplami=0;
       int birlerBasamagi=0;

        for (int i = 1; i <=sayiStr.length() ; i++) {
            birlerBasamagi= sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;

        }
        System.out.println("rakamlarToplami"+ "=" +rakamlarToplami);
                                        // rakamlarToplami=30


    }
}