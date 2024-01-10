import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        //ARRAY CON CHAR
        /*
        char[] arrayChar = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i] + " ");
        }
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = (char) i;
        }
        System.out.println("");
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print((int) arrayChar[i] + " ");
        }
         */
        //array de 5 posiciones con valores
        int x = 5;
       int [] arrayint = new int[x];
        for (int i = 0; i < arrayint.length; i++) {
            arrayint[i] = i;
        }
        for (int var : arrayint) {
            System.out.print(var + " ");
        }
        System.out.println("\nSiguiente ejercicio");

        int nuevoValor = 0;
        /*
        System.out.print("Designe un nuevo tamaño para el array: ");
        x = scan.nextInt();
        arrayint = new int[x];
        */
        for (int i = 0; i < arrayint.length; i++) {
            System.out.print("Designe el valor de la posición " + (i+1) + " del array: ");
            nuevoValor = scan.nextInt();
            arrayint[i] = nuevoValor;
        }
        System.out.print("El array es: ");
        for (int i =0 ; i < arrayint.length; i++) {
            System.out.print(arrayint[i] + " ");
        }
    }
}
