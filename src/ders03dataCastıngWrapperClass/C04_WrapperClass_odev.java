package ders03dataCastıngWrapperClass;

public class C04_WrapperClass_odev {
    public static void main(String[] args) {

     int sayi= 20;
     String str= "Java ogrenilir";

        System.out.println(sayi+" "+str);

        char krktr= 'b';
        Character krktrWrapper= 'c';
        krktrWrapper.charValue();
        System.out.println(Character.isLetter('7')); // false
        System.out.println(Character.isDigit('7')); // true

        String str1= "123";
        String str2= "10";

        System.out.println(str1+str2);  // 12310
        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2)); // 133
        System.out.println(Integer.parseInt(str1)*Integer.parseInt(str2));  // 1230













    }
}
