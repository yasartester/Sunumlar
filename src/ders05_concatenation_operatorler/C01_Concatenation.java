package ders05_concatenation_operatorler;

public class C01_Concatenation {
    public static void main(String[] args) {

        String s1= "Java";
        String s2= "Guzeldir";
        String s3= "";
        String s4=" ";

        int sayi1= 4;
        int sayi2= 3;

        // Java Guzeldir7         yazdiralim
        System.out.println(s1+s4+s2+(sayi1+sayi2));  // Java Guzeldir7

        //  7Java Guzeldir
        System.out.println(sayi1+sayi2+s1+s3+s2);

        // 43Java Guzeldir
        System.out.println(s3+sayi1+sayi2+s1+s2);

        // Java Guzeldir 12
        System.out.println(s1+s4+s2+s4+ (sayi1*sayi2));










    }
}
