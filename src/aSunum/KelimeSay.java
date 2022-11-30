package aSunum;

import java.util.Scanner;

public class KelimeSay {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();

        System.out.println("kelimeSay2(cumle) = " + kelimeSay2(cumle));



    }
    private static int kelimeSay2 (String cumle) {

        String cumleArray[] = cumle.split(" ");
        int kelimeSayisi = cumleArray.length;
        return kelimeSayisi;

    }
}
