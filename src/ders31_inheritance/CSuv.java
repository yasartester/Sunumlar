package ders31_inheritance;

public class CSuv extends BinekArac{

    public static void main(String[] args) {

        CSuv suv1 = new CSuv();
        System.out.println(suv1.marka);   // Binek araclar farkli markalara sahip olabilir
        System.out.println(suv1.model);   // Binek araclar farkli modellerde olur
        System.out.println(suv1.yil);     // 1900
        System.out.println(suv1.motor);   // Tum araclar motorludur
        System.out.println(suv1.plaka);   // Tum araclar plakalidir
        System.out.println(suv1.yakit);   // Araclar farkli yakitlar kullanir
        suv1.teker();                     // Binek araclarin 4 tekeri olur
        suv1.hiz("benzin");          // Binek araclarin hizi modele gore degisir


        CSuv suv2= new CSuv();
        suv2.marka="Toyota";
        suv2.model="Rav4";
        suv2.motor="1.6";
        suv2.plaka="06 ANKA 006";
        suv2.yakit="Benzin";
        suv2.yil=2022;
        suv2.hiz(suv2.yakit);
    }
    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli SUV'ler max 300 km hiz yapar");
    } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel SUV'ler max 260 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Hibrit SUV'ler max 220 km hiz yapar");
        }else {
            System.out.println("yakit bilinmeden max hiz soylenemez");
        }
    }

    }
