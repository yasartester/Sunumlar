package ders13_nestedForLoop_methodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {

        // Asagidaki metni buyuk harfe cevirin
        String str= "Java hayattir";

        System.out.println(str.toUpperCase()); // JAVA HAYATTIR  bu sekliyle gecici olarak buyuk yazar
        System.out.println(str);              //  Java hayattir

        String buyukHarf= str.toUpperCase();  // kalici olarak buyuk harfe cevirip buyukHarf'e atama yapti
        System.out.println(buyukHarf);        // JAVA HAYATTIR

        // metnin buyuk harfli hali "a" icerir mi?
        System.out.println(buyukHarf.contains("a"));// false

        // metnin buyuk harfli hali "A" icerir mi?
        System.out.println(buyukHarf.contains("A"));// true

    }
}
