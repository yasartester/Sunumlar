package ders13_nestedForLoop_methodOlusturma;

public class METOD_OLUST {


        public static void main(String[] args) {
            String str1= "Java";
            String str2= "Guzeldir";
            KelimeBirlestir(str1,str2);
            System.out.println(KelimeBirlestir(str1,str2));


        }
        public static String KelimeBirlestir(String str1, String str2){
            System.out.println("Kelime brlestir Methodu calisiyor");
            return str1+" " +str2;
        }
    }




