package ders17_scope;

public class C04_ClassVariables {
    public static void main(String[] args) {

        // C03'teki hastane ismini yazdirmak istersek
        System.out.println(C03_ObjectVariables.hastaneIsmi);// Yildiz Hastanesi

         // C03'teki hasta sayisini yazdirmak istersek
        System.out.println(C03_ObjectVariables.hastaSayisi); // 26471

        // C03'teki hasta sayisini arttirmak istersek
        C03_ObjectVariables.hastaSayisi++;  // 26471 + 1 = 26472

        C03_ObjectVariables.hastaSayisi++;
        method1();

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23456

    }

            // kod takibi main method'dan baslar
            // main method'un sonuna gelindiginde hersey biter
            // tum degisimler resetlenir
            // variable degerleri bastaki hallerine doner

    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;

    }

    }

