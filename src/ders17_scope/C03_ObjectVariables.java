package ders17_scope;

public class C03_ObjectVariables {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static int hastaSayisi = 26471;
    static String basHekimIsmi;
    String persIsmi = "Isim girilmedi";
    String persTelNo = "telefon numarasi girilmedi";
    int persYasi;

        /*
            Class level variable'larin scope'u tum class'dir
            static kelimesi ile isaretlenen variable'lara
            class icerisinde heryerden ulasilabildigi icin diger adi class variables'dir.
            static kelimesi ile isaretlenmeyen variable'lara ise instance variable denir.
            instance variable'lar objelere bagli olduklarindan
            bu variable'larin diger adi object variables'dir.
        */

    public static void main(String[] args) {
    }
}