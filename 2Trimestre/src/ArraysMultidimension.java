import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ArraysMultidimension {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
        //3.	Repetir el ejercicio anterior para que antes del último paso
        // (imprimir la matriz), se lea por pantalla un String. En caso de ser “MAYUSCULAS”,
        // pasar a mayúsculas el contenido de la matriz. En caso de ser “minusculas”,
        // pasar a minúsculas el contenido de la matriz. En cualquier otro caso, no hacer nada.
        // A continuación, imprimir la matriz.
*/
        System.out.println("\n ejercicio 1");
        String[][] nombres =
                {{"Vargas", "MAnuel", "Bojita", "Adan"}, {"Julian", "Carlos", "Juan", "David"},};
        int alto;
        int ancho;
        String nombre = "";
        do {
            System.out.println("introduce la posicion de altura");
            alto = scan.nextInt();
            System.out.println("introduce la posicion de ancho");
            ancho = scan.nextInt();
            if (alto< nombres.length&&alto>=0&&ancho<nombres[alto].length){
            System.out.println("introduce un nombre");
            nombre = scan.next();
            nombres[alto][ancho] = nombre;
        }else{
            System.out.println("Posicion invalida");
        }
    }while(alto<2&&alto>=0&&ancho<4&&ancho>=0);
        System.out.println("Desea imprimirlo en MAYUSCULAS o minusculas ");
        String mayus = scan.next();
        for (int i = 0; i < nombres.length; i++) {
        for (int j = 0; j < nombres[i].length; j++) {
            if(mayus.equals("MAYUSCULAS") ){
                nombres[i][j] = nombres[i][j].toUpperCase(Locale.ROOT);
                System.out.print(nombres[i][j] + " ");
            }
            else if (mayus.equals("minusculas") ){
                nombres[i][j] = nombres[i][j].toLowerCase(Locale.ROOT);
                System.out.print(nombres[i][j] + " ");
            }
            else {
                System.out.print(nombres[i][j] + " ");
            }

        }
        System.out.println(" ");
    }

        /*
        1. Leer por teclado un entero y crear una matriz cuadrada (mismo numero de filas que de columnas). Dependiendo
         del tamaño tendrá esta forma:
// Tamaño 1
        1
// Tamaño 2
        10
        10
// Tamaño 3
        101
        101
        101
// Tamaño 4
        1010
        1010
        1010
        1010
         */

        System.out.println("\n Ejercicio 1"); int tam = 0; do{System.out.println("Introduce el tamanyo de la matriz");tam = scan.nextInt();}while(tam<0);int[][] array = new int[tam][tam];for (int i = 0; i < array.length; i++) {for (int j = 0; j < array[i].length; j++) {if (j % 2 == 0) {array[i][j] = 1;} else {array[i][j] = 0;}System.out.print(array[i][j]);}System.out.println();}System.out.println("FIN");
    }
}
