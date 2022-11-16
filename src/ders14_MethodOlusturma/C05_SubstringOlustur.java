package ders14_MethodOlusturma;

public class C05_SubstringOlustur {
     /*
    Soru 1- Kullanicidan input olarak bir String alin,
    baslangic ve bitis indexlerine gore baslangic index'i dahil, bitis index'i haric olacak sekilde
    aradaki harfleri yazdiran bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */

    public static void main(String[] args) {
        String input = "Java pek cok guzelmis";
        int basIndexi = 5;
        int sonIndex = 8;  // 5. index dahil 7. index haric olacak sekilde

        kendiSubstringMethodumuz(input,basIndexi,sonIndex);
        kendiSubstringMethodumuz("Java",1,3);

    }
    public static void kendiSubstringMethodumuz(String input, int basIndexi, int sonIndex){
        
        if (basIndexi>sonIndex){
            System.out.println("Baslangic Indexi, Son index'ten buyuk olamaz");
            
        } else if (sonIndex>=input.length()) {
            System.out.println("Son index String'in disinda");

        }else {

            for (int i = basIndexi; i <sonIndex ; i++) {
                System.out.print(input.charAt(i));

            }
            System.out.println(" ");
            
        }


    }
}
