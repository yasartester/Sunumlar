package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int []arr= {1,3,8,23,99};
        System.out.println("Bu array'in uzunlugu : "+ arr.length +" karakterdir");
              // Bu array'in uzunlugu : 5 karakterdir");


        System.out.println(arr[2]); // 8 sayisini verir

        arr[2]=20;   // bu satirdan itibaren arr[2] (2. index)'teki 8 silinmis yerine 20 gelmistir
        System.out.println(arr[2]); // 8 sayisi yerine  20 sayisini verir

        // son elementi bulmak icin
        System.out.println(arr[arr.length-1]);  // 99 yazdirir  son element

        // array'in tum elementlerini yazdirin
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");  // 1 3 20 23 99  seklinde elementleri yazdirir,
            // array'i yazdirmis olmaz
        }
                     // array'in uzunlugu sonradan degistirilemez

                 arr[5]=35;
        // 5. index olmadigi icin 5. indexe atama yapilamaz
            // burda 5. length var ama 5. index yok   index=  length-1
            // array'de olmayan bir indexe atama yapmak isterseniz
        // ArrayIndexOutOfBoundsException
        // bu hata Compile Time Error CTE degil
        // Run Time Error'dur
        // bu yuzden kodu calistirdiktan sonra hata verir.


        }

    }

