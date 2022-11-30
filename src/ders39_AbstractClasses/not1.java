package ders39_AbstractClasses;

public class not1 {
    /* 1- Abstraction : Java’da bir zorunluluk degil kolaylik olan abstraction,
        kendisinden obje olusturulmayan class’lar icin gelistirilmis bir consept’tir.
2- Bu konsept inherit edilen parent class’larin child class’larini belirledikleri method’lari
        mutlaka override etmeye zorlayan bir yapidir.
3- Bir class’in child class’lari icin bazi method’lari mecbur kilmasini istedigimizde
        o class’i abstract keyword kullanarak abstract class yapmaliyiz.
4- Bir abstract class’da olusturulan ve abstract keyword ile isaretlenen method’lar,
        child concrete class’lar tarafindan override edilmek zorundadir.
5- Yani abstract bir class’daki zorunlu override edilecek method’lari belirleyen  baslarina yazilan abstract keyword’dur.
6- Abstract class’daki abstract method’lar child class’lar tarafindan
        mecburen override edilecegi icin body kullanmazlar. (body olsa da zaten kullanilmayacakti)
7- Bazen olusturacagimiz proje icin birden fazla abstract class kullanilabilir.
        Abstract child class’lar abstract parent’larindaki abstract method’lari override etmek zorunda degildir.
         Abstract bir silsileden sonra gelen ilk concrete class,
         parent silsilesinde concrete yapilmayan tum abstract method’lari override etmelidir.    */

}
