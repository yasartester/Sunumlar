package ders13_nestedForLoop_methodOlusturma;

public class C01_ForLoop_OKEY {
    public static void main(String[] args) {

        String input= "Caba emek kazanc";
        // bu cumleyi tersten yazdirin
        System.out.println(input.length()); // bu cumle 16 karakterdir. 16-1=15 ten geriye yazdir
        for (int i= input.length()-1; i>=0; i--){
            System.out.print(input.charAt(i));}

        System.out.println("");

            String kelime= "Ogrenecegim seni java";
            System.out.print(kelime.length()); // 21 karakter
        System.out.println("");
        int harfSayisi= kelime.length()-1;
        for (int i = harfSayisi; i>=0; i--){
            System.out.print(kelime.charAt(i));
    }
}}
