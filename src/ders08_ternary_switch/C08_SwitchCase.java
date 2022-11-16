package ders08_ternary_switch;

import java.util.Scanner;

public class C08_SwitchCase {
    public static void main(String[] args) {
        // kullanicidan ay numarasini alip mevsim adini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ay numarasini giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Hatali giris");
        }

    }
}
