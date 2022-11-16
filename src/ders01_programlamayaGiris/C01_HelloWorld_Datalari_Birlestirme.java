package ders01_programlamayaGiris;

public class C01_HelloWorld_Datalari_Birlestirme {
    public static void main(String[] args) {

          String a= "Hello";
          String b= "Dunya";
          System.out.println(a+b);


        String x= "Hello";
        String y= "Dunya";
        System.out.println(x+" "+y);

        String k= "Hello";
        int l=2;
        int m=3;
        System.out.println(k+l+m);    // Hello23
        System.out.println(m+l+k);    // 5Hello
        System.out.println(k+(l+m));  // Hello5
        System.out.println(k+l*m);    // Hello6

        String str1= "Java";
        String str2= "Guzeldir";
        int sayi1=5;
        int sayi2= 4;
                // yukaridaki variable lari kullanarak istenen metinleri yazdiralim
        System.out.println(str1+" "+str2+ " "+sayi1+sayi2);  // Java Guzeldir 54

                // Java Guzeldir 9 yazdiralim
        System.out.println(str1+ " " +str2+ " " +(sayi2+sayi1));

                // 54 Guzeldir  yazdiralim
        System.out.println(""+sayi1+sayi2+ " "+ "Guzeldir");

        System.out.println(str1.concat(str2)); // JavaGuzeldir
        System.out.println(str1.concat("  ").concat(str2)); // Java Guzeldir



    }

}
