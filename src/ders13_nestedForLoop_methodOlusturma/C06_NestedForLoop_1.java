package ders13_nestedForLoop_methodOlusturma;
public class C06_NestedForLoop_1 {
    public static void main(String[] args) {
        /*
        Asagidaki sekli yazdiran bir kod hazirlayin
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        for (int i = 5; i <=1 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println(""); // ic loop bitince alt satira gec
        }


    }
}
