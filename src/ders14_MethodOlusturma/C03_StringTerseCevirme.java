package ders14_MethodOlusturma;

public class C03_StringTerseCevirme {
    // parametre olarak bir String kabul edip
    // String'in terse cevrilmis halini döndüren bir method olusturun

    public static void main(String[] args) {

        String input = "Java kod yazdikca ogrenilir";

        System.out.println(stringiTerseCevir(input)); // rilinergo ackidzay dok avaJ

    }

        public static String stringiTerseCevir(String input) {
        String tersStr = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            tersStr = tersStr + input.charAt(i);

        }

        return tersStr;
    }
}


