package $dersHariciSorular;

import java.util.Scanner;

public class Stringi_split_ile_ayirma {
    public static void main(String[] args) {


                /** ornegin verilen bir double sayi dusunun 12.4587844644 gibi
                 * ben noktadan sonra sadece iki basamak istiyorum bunu hem
                 * String'e atayip String manipulation ile cozmeyi deneyin veya
                 * sayi haliyle duzenleyen iki ayri method yazabilirsiniz (edited)
                 ** ornegin kullanicidan String seklinde gelen tarih dusunun bunu
                 * ornegin "-" isaretine gore split edin daha sonra burdaki
                 * verilerle localdate clasindan tarihe donusturun bu tarihin
                 * haftasonuna denk gelip gelmedigini kullaniciya soyleyin (edited)
                 mesela 12-05-2022 tarihi girdik haftasonu mu degil mi ?*/

                Scanner scan = new Scanner(System.in);
                System.out.println(" double bir deger girin");
                double sayi = scan.nextDouble();
                System.out.println(basamakDuzenle(sayi));
                System.out.println(basamakDuzenle1(sayi));

            }
            public static double basamakDuzenle(double x){
                String ysayi =  Double.toString(x);
                ysayi = ysayi.substring(0, ysayi.indexOf('.')+3) ;

                return Double.parseDouble(ysayi);

            }
            public static double basamakDuzenle1(double x){
                x = x*100;
                int y = (int) x;
                x = y/100.0;
                return x;
            }

        }
