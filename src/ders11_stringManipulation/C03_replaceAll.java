package ders11_stringManipulation;
public class C03_replaceAll {
    public static void main(String[] args) {
        String str= "seyhan yavuz";
        // str'daki sayilari silip metni Java Guzeldir haline donusturelim
        // str.replaceAll() sadece bir harf veya char sequence'i degil
        // genelleme ile soyleyebilecegimiz ortak ozellikteki tum karakterleri degistirir
        System.out.println(str.replace("s", "S").replace("y", "Y"));
    }
}