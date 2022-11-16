package ders09_stringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str= "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8)); // besinci index dahil(inclusive)
                                                // sekizinci dahil degil(exclusive)    // gun
        System.out.println(str.substring(9,17));  //  gectikce   yazdirir
        System.out.println(str.substring(3,8).toUpperCase()); // A GUN  yazdirir

        String isim= "haSaN";
        System.out.println(isim.substring(1,4).toLowerCase()); // asa  yazdirir

        //ilk harfi buyuk digerlerini kucuk harf alalim
        isim= isim.substring(0,1).toUpperCase()+ // ilk harfi buyuk yaptik
              isim.substring(1).toLowerCase();// diger harflerin hepsini kucuk yazdik

        System.out.println(isim);  // Hasan   istenen sonucu elde ettik

        System.out.println(isim.substring(2,5));  // san

        // sadece 3. harfi yazdirin
        System.out.println(isim.substring(2,3)); // S yazdirir

        System.out.println(isim.substring(2,2)); // hic bir sey yazdirmaz  2-2= 0 adet harf
       // System.out.println(isim.substring(5,2)); // hata verir









    }
}
