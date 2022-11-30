package ders17_scope;

public class C05_ObjectVariables {

    public static void main(String[] args) {

        // C03 class'indaki instance variable'lara nasil ulasabiliriz ?
        // instance variable'larin diger adi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabiliriz

        C03_ObjectVariables eleman1 = new C03_ObjectVariables();

        System.out.println(eleman1.persTelNo); //telefon numarasi girilmedi
        System.out.println(eleman1.persIsmi); // Isim girilmedi
        System.out.println(eleman1.persYasi); // 0

        eleman1.persIsmi="Yakup";
        eleman1.persYasi=34;
        eleman1.persTelNo= "5345734652";

        System.out.println(eleman1.persIsmi);// Yakup
        System.out.println(eleman1.persYasi); // 34
        System.out.println(eleman1.persTelNo); // 5345734652

        C03_ObjectVariables pers2= new C03_ObjectVariables();
        pers2.persIsmi="Latife";
        pers2.persYasi=32;
        pers2.persTelNo="555 4322321";


        System.out.println(eleman1.persIsmi); // Yakup
        System.out.println(pers2.persIsmi); // Latife

        C03_ObjectVariables pers3= new C03_ObjectVariables();

        pers3.persIsmi="Heysem";
        pers3.persYasi=30;
        pers3.persTelNo="312 2134567";

        System.out.println(eleman1.persYasi); // 34
        System.out.println(pers2.persYasi); // 32
        System.out.println(pers3.persYasi); // 30

    }

}