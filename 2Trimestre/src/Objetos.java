import java.util.Enumeration;
import java.util.Locale;
import java.util.Scanner;

public class Objetos {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Que tabla de multiplicar desea? ");
        int numero = scan.nextInt();
        tablaDeMultiplicar(numero);


    }
    public static void tablaDeMultiplicar(int multiplicando){
        iguales();
        System.out.println("TABLA DE MULTIPLICAR DEL " + multiplicando);
        iguales();
        for (int i = 0; i <= 10; i++) {
            System.out.println(multiplicando + " x " + i + " = " + (multiplicando*i) );
        }
    }
   public static void iguales (){
       System.out.println("========================");
   }


}
