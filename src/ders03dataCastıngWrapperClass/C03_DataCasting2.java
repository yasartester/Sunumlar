package ders03dataCastıngWrapperClass;

import java.util.Scanner;

public class C03_DataCasting2 {
    public static void main(String[] args) {

        System.out.println('a'+'b'); // 97+98=195

       // kullanicidan char bir karakter alip o karakterden sonra gelen 3 karakteri yazdirin
       // ornek input: a  output:b,c,d

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
                char girilenKrk= scan.next().charAt(0);
        System.out.println(""+(char)(girilenKrk+2)+(char)(girilenKrk+3)+(char)(girilenKrk+4));





    }
}
