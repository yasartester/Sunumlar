package ders14_MethodOlusturma;

public class C07_AsalSayiKontrol {
    // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip,
    // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
    public static void main(String[] args) {
        int sayi=24;
        System.out.println(asalSayiKontrolEt(sayi)); // asal degil
        System.out.println(asalSayiKontrolEt(23)); // asal
        System.out.println(asalSayiKontrolEt(5674532)); // asal degil
    }
    public static String asalSayiKontrolEt(int sayi){
        String sonuc="";
        for (int i = 2; i <= (sayi-1) ; i++) {
            if (sayi%i==0){
                sonuc="asal degil";
                break;
            }
        }
        if (!sonuc.equals("asal degil")){
            sonuc="asal";
        }
        return sonuc;
    }

}
