import java.util.Scanner;

public class Ejercicios15deEnero {
    public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
       // 11.	Crear un array de String de tamaño 3, con los nombres de tres
        // compañeros de clase. A continuación, pedir por teclado un nombre,
        // y comprobar si está en el array, escribiendo un mensaje al respecto de tipo: Juan esta en el array.
        System.out.println("\n Ejercicio 11");
        String [] arrayEj11 ={"Diana", "Sergio", "Jesus"};

        System.out.print("Escriba el nombre de un companyero para saber si esta en el array: ");
        String compi = scan.next();
        boolean clase = false;
        for (String var: arrayEj11) {
            if(compi.equalsIgnoreCase(var)){
                System.out.println(compi + " esta en el array");
                clase = true;
                break;
            }
            else{
                clase = false;
            }
        }
        if(!clase){
            System.out.println(compi + " no esta en el array");
        }

        // 12.	Repetir escribiendo un mensaje de tipo:
        // Juan esta en el array en la posición 2.
        System.out.println("\n Ejercicio 12");
        System.out.print("Escriba el nombre de un companyero para saber si esta en el array: ");
       compi = scan.next();
       clase = false;
        for (int i=0; i < arrayEj11.length; i++) {
            if(compi.equalsIgnoreCase(arrayEj11[i])){
                System.out.println(compi + " esta en el array en la posicion " + i);
                clase = true;
                break;
            }
            else{
                clase = false;
            }
        }
        if(!clase){
            System.out.println(compi + " no esta en el array");
        }

        // 13.	Leer por pantalla un numero entero y crear un array de ese tamaño,
        // con valores aleatorios entre 1 y 300. A continuación, pedir un número entero entre 0 y 9,
        // e imprimir todas las posiciones del array que tengan un número acabado en ese dígito.
        // Esos números, además de imprimirlos, almacenarlos en un array de salida con el tamaño adecuado.
        System.out.println("\n Ejercicio 13");
        System.out.print("Introduzca el tamaño que quiera de array: ");
        int [] arrayEj13 = new int[scan.nextInt()];
        for (int i = 0; i < arrayEj13.length; i++) {
            arrayEj13[i] = (int)Math.floor(Math.random() * 300);
        }
        int numero;
        do {
            System.out.print("Introduce un numero del 0 al 9 para comprobar las posiciones que acaben en el: ");
            numero = scan.nextInt();
        }while (numero < 0 || numero > 10);
        int contador = 0;
        System.out.print(numero + " está en las posiciones: ");
        for (int i = 0; i < arrayEj13.length; i++) {
            if (numero == arrayEj13[i]%10){
                contador ++;
                System.out.print(i + " ");
            }
        }
       int [] lista = new int[contador];
        int n = 0;
        for (int i = 0; i < arrayEj13.length; i++) {
            if (numero == arrayEj13[i]%10){
               lista [n] = arrayEj13[i];
               n++;
            }
        }
        System.out.print("\n El array generado, con los numero que terminan en " + numero + "es: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("FIN");
    }
}
