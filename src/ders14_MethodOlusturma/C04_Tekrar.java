package ders14_MethodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // bu iki sayinin carpim sonucunu yeni bir kod yazmadan konsola yazdirin
        System.out.println(C01_Carpim.carpimMethodu(a, b)); //200.0


        String c="Nasil";
        String d="yani?";

        // Bu iki stringi aralarinda bir bosluk birakarak yazdirin
        System.out.println(C02_StringConcate.birlestirMethodu(c, d)); // Nasil yani?

        String e= "Bu da mi oldu?";
            // e stringini tersten yazdirin
        System.out.println(C03_StringTerseCevirme.stringiTerseCevir(e)); // ?udlo im ad uB

            // "Bu cumleyi terse cevirin"
        System.out.println(C03_StringTerseCevirme.stringiTerseCevir("Bu cumleyi terse cevirin"));
            // nirivec esret iyelmuc uB

        String str="Java pek guzel";
            // str'i buyuk harf ile yaz
        System.out.println(str.toUpperCase()); // JAVA PEK GUZEL



    }
}
