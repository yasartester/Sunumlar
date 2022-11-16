package ders36_exception;

    public class ExceptionsDemo {
        public static void main(String[] args) {
            System.out.println("Proje basladi");

            int a=0;
            try {
                a= 2/0;
            }catch (ArithmeticException err){
                System.out.println(err.getMessage());

            }
            System.out.println(a);
            System.out.println("Proje bitti");
        }
        }
