package ders20_multiDimensionalArrays;
    public class C06_MDA_Soru {

        public static void main(String[] args) {
        // Soru 5- Verilen 2 katli bir array’de
        // her bir inner array’in son elementlerinin toplaminini yazdiran
        // bir method olusturun.

            int[][] arr={{5,7}, {5, 9, 8},{0,1}};
            sonElementlerinToplami(arr);

                }
            public static void sonElementlerinToplami(int [][]arr){
                int toplam=0;
                for (int i = 0; i <arr.length ; i++) {
                    toplam+=arr[i][(arr[i].length-1)];

                }
                System.out.println("Inner array'lerin son elementlerinin toplami : "+ toplam);
        }

    }

