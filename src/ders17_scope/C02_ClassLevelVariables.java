package ders17_scope;

public class C02_ClassLevelVariables {

    // class level variable'lar method'larin disinda olusturulurlar
    // genel kullanim en ustte olusturulmalaridir

    static String hastaneIsmi= "Yildiz Hastanesi";
    static int hastaSayisi= 3452;
    static String basHekimIsmi="belirtilmedi";
    String persIsmi="Isim girilmedi";
    String persTelefonu="Telefon girilmedi";
    int persYasi;


    public static void main(String[] args) {
        System.out.println(hastaneIsmi); // Yildiz hastanesi
        System.out.println(basHekimIsmi); // null
        //System.out.println(persIsmi); // static olmadigi icin static main method'dan kullanilamaz
        /*
         Class level variabler'a deger atamasi yapilmamis olursa
         Java bu variable'lara data turune gore
         default olarak tanimlanan degerleri atar
         default degerler
         sayisal variable'lar : 0
         boolean : false
         char : ''
         Objeler (String dahil) : null
         */
        method1();
        // method2(); method2 static olmadigi icin cagirilamaz
    }

    public static void method1() {
        System.out.println(hastaSayisi);
        hastaSayisi++;
        hastaneIsmi="hayat";
        System.out.println(hastaSayisi);
        System.out.println(hastaneIsmi); // yalnizca bu method'da hastane ismi degisir diger method'larda ayni kalir.

    }
    public void method2(){ // static olmadigi icin bu method icerisindeki variable'lar
                           // main method'dan cagirilamaz ve yazdirilamaz

        System.out.println("m2 : "+ hastaneIsmi);
        hastaSayisi++;
        System.out.println("m2 : "+basHekimIsmi);
        System.out.println("m2 : "+persIsmi);
        System.out.println("m2 : "+persYasi);

    }
}

