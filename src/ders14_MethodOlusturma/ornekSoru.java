package ders14_MethodOlusturma;

public class ornekSoru {
    public static void toplama1(int sayi1, int sayi2){
        int sonuc = sayi1+sayi2;
        System.out.println(sayi1+ "+"+sayi2 +"=" +sonuc);
        
    }
    public static void toplama1(int sayi1, int sayi2, int sayi3){
        int sonuc = sayi1+sayi2+sayi3;
        System.out.println(sayi1+ "+"+sayi2+ "+" +sayi3+"=" +sonuc);}
    public static void carpma(int sayi){
        int sonuc = sayi*sayi;
        System.out.println(sayi+ "*"+sayi+"=" + sonuc);}
    public static int bolme (int sayi1, int sayi2){
        int sonuc = sayi1/sayi2;
        System.out.println(sayi1+ "/"+sayi2+"=" + sonuc);
        return sonuc;
    }

    public static void main(String[] args) {
        toplama1(7,8);   // 7+8=15
        toplama1(8,9,6); // 8+9+6=23
        carpma(7); // 7*7=49
        bolme(120,30); // 120/30=4
        
    }
}
