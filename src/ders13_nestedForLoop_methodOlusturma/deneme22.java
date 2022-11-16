package ders13_nestedForLoop_methodOlusturma;

public class deneme22 {
    public static void main(String[] args) {

        String input = "insanlar konusa konusa";
        // bu String'i tersine cevirip  kaydedelim
        String terseCevirme = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            {
                System.out.print(input.charAt(i));

            }

        }
    }}
