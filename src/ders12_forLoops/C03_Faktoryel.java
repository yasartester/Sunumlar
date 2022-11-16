package ders12_forLoops;

public class C03_Faktoryel {
    public static void main(String[] args) {

        // kullanicinin verdigi sayinin faktoryelini bulalim

        int sayi=10;  // bu sayinin faktoryelini bulacagiz

        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoryel=faktoryel*i;

        } System.out.println("FAKTORYEL: " +faktoryel); // 3628800


    }
}
