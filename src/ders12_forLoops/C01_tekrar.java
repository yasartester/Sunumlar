package ders12_forLoops;

public class  C01_tekrar {
    public static void main(String args[]) {
        /*
        Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
	    - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
	    - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
	    - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
         */

        int sayi = 130;

        for (int i = 1; i <=130 ; i++) {

            if (i%15==0){ System.out.print("fizzBuzz\n ");}
            else if (i%3==0){ System.out.print("fizz\n ");}
            else if (i%5==0) {System.out.print("buzz\n ");}
            else System.out.print(i+" \n");


        }


    }
}