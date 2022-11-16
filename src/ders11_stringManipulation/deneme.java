package ders11_stringManipulation;
public class deneme {
    public static void main(String[] args) {
        int sayi=1453;

        int birlerBasamagi= 0;
        int rakamlarToplami=0;

        for (int i = 1; i <=4 ; i++) {
        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;}
        System.out.print(rakamlarToplami);
        System.out.println(" ");

        int number;   // Yazılacak sayıları tutacak değişken
        number = 20;   // değişkene verilen ilk değer: 1.
        while ( number < 100 )
        {  // mantıksal_deyim
            System.out.println(number);
            number = number + 5;  // sonraki sayıyı al
        }
        System.out.println("Done!");
    }}