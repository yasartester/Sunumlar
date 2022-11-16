package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();

        System.out.println(tarih); // 2022-10-29
        System.out.println(tarih.minusDays(100)); // 100 gun onceki tarih  2022-07-21
        System.out.println();
        LocalDateTime zaman= LocalDateTime.now();
        System.out.println(zaman.getDayOfMonth()); // 29

    }
}
