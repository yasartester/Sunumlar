package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        // Dogumunuzdan bugune ne kadar zaman gecti

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1982,01,15);

        Period gecenSure= Period.between(dogumGunu,bugun);
        System.out.println(gecenSure); // P40Y 9M 14D
        System.out.println(gecenSure.getYears()); // 40


    }
}
