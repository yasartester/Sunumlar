package ders13_nestedForLoop_methodOlusturma;
public class C02_StringTersineCevirme {
    public static void main(String[] args) {
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input= "Java, Java her gecen gun guzellesiyor";
        String tersInput="";

        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput += input.substring(i , i+1);
        }
        System.out.println("Ters hali : " + tersInput); // royisellezug nug neceg reh avaJ
        System.out.println("");


        String duz= "Öldürmeyen güçlendirir";
        String ters="";

        for (int i= duz.length()-1; i>=0; i--){
            ters += duz.substring(i , i+1);}
            System.out.print("duz'un ters'i : "+ters);


    }
}