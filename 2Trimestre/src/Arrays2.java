import java.util.Scanner;

public class Arrays2 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("\n 6 Ejercicio Array por Scaner");
        int x = 0;
        System.out.print("Designe cuántos valores debe tener el array: ");
        x = scan.nextInt();
        int nuevoValor = 0;
        int [] arrayInt = new int[x];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Designe el valor de la posición " + (i+1) + " del array: ");
            nuevoValor = scan.nextInt();
            arrayInt[i] = nuevoValor;
        }
        System.out.print("El array es: ");
        for (int i =0 ; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }

        System.out.println("\n 8 Ejercicio Array aleatorio");
        System.out.print("Introduzca el tamanyo del array: ");
        int tamanyo = scan.nextInt();
        int suma = 0;
        int [] arrayInt = new int[tamanyo];
        for (int i = 0; i < arrayInt.length; i++) {
            int random= (int) (Math.random()*10);
            arrayInt [i] = random;
            suma = suma + random;
        }
        System.out.print("El array es: ");
        for (int i =0 ; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.print("\nLa suma de todos sus valores es: " + suma);

        int tamano = 100;
        int [] arrayde100 = new int[tamano];
        int suma = 0;
        float media;
        for (int i = 0; i < arrayde100.length; i++) {
            suma = suma + (i + 1);
            arrayde100[i]=(i + 1);
        }
        System.out.print("Los número del 1 al 100 son: ");
        for (int var : arrayde100) {
            System.out.print(var + " ");
        }
        System.out.println("\n la suma de todos ellos es: " + suma);
        media = (float) suma/ arrayde100.length;
        System.out.println("\n La media es: " + media);
         */

        System.out.println("\n ejercicio 10");
        char letra = 'A';
        char [] arrayLetras = new char['Z'-'A' + 1];
        String cadena = "";
        for (int i = 0; i <arrayLetras.length; i++) {
                arrayLetras[i] = letra;
                letra++;
        }
        int numero = 0;
        do{
            System.out.print("Introduzca el número de la letra que desea añadir a su nueva lista (si desea salir introduzca un número negativo): ");
            numero= scan.nextInt();
            if(numero <0){
                System.out.println("Ha decidido salir de la aplicación. FIN ");
            }else if (numero > 25){
                System.out.println("No se encuentra esa letra, intentelo de nuevo");
            }
            else {
                cadena = cadena + arrayLetras[numero];
                System.out.println("Se ha introducido la letra " + arrayLetras[numero]);
            }
        }while(numero >= 0);
        System.out.println("Las letras son: ");
        for (char var : arrayLetras) {
            System.out.print(var + " ");
        }
        System.out.println("\nSu lista de letras escogidas es: " + cadena );
    }
}
