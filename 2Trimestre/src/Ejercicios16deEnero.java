import java.util.Scanner;

public class Ejercicios16deEnero {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        int [] arrayOrdenar = new int[10];
        for (int i = 0; i < arrayOrdenar.length; i++) {
            arrayOrdenar[i] = (int)Math.floor(Math.random() * 10) + 1;
        }
        int valor1;
        int valor2;
        for (int var: arrayOrdenar
             ) {
            System.out.print(var + " ");
        }
        System.out.println(" ");
        int contador;
        int posicion ;
        for (int j = 0; j < 10; j++) {
            contador =10-j;
            posicion = 0;
            do {
                valor1 = arrayOrdenar[posicion];
                valor2 = arrayOrdenar[posicion+1];
                if (valor1 > valor2) {
                    arrayOrdenar[posicion] = valor2;
                    arrayOrdenar[posicion + 1] = valor1;
                }
                contador--;
                posicion++;
            } while (contador > 1);
        }
        for (int var: arrayOrdenar
        ) {
            System.out.print(var + " ");
        }
        System.out.println("\nFIN");
    }
}
