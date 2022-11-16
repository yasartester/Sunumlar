package ders04_matematikselIslemler_Increment_Decrement;

public class C06_prePost_Increment {
    public static void main(String[] args) {

        int a= 10;
        // a variable nin degerini yazdirip sonra a yi 1 artir
        //  a nin degerini 1 artirip sonra yazdirin
        System.out.println("a'nin degeri: "+ a++); // a'nin degeri 10 yazildiktan sonra 11 oldu.
        System.out.println("a'nin yeni degeri: "+a);    // a:12

        int b=10;
        // b variable'nin degerini 1 artirin sonra yazdirin
        b++;
        System.out.println("b'nin degeri: "+b); // b: 11

    }
}
