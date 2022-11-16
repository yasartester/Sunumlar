package ders08_ternary_switch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1= "ALI";
        String str2= "ALI";

        // verilen  iki metin birbiriyle ayni ise "metinler ayni",
        // farkli ise "metinler farkli" yazdirin.

        if (str1.equals(str2)){
            System.out.println("Metinler aynidir");}
        else {
            System.out.println("Metinler farklidir");}

        System.out.println(str1.equals(str2)? "metinler ayni" : "metinler farkli");





    }
}
