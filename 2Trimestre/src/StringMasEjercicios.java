import java.util.Locale;
import java.util.Scanner;

public class StringMasEjercicios {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        //1- Leer una frase por teclado (máximo 80 caracteres)
        // y construir otras dos cadenas de forma que una contenga los caracteres
        // en la posición par y la otra los caracteres en posición impar.
        System.out.println("\nEjercicio 1");
        String frase = "";
        String pares = "";
        String impares = "";
        do {
            System.out.println("Introduzca una cadena: ");
            frase = scan1.nextLine();
        } while (frase.length() > 80);
        for (int i = 0; i < frase.length(); i++) {
            if (i % 2 == 0) {
                pares += frase.charAt(i);
            } else {
                impares += frase.charAt(i);
            }
        }
        System.out.println(pares);
        System.out.println(impares);

        //2- Introducir una cadena y pasarla en función de una variable
        // de  opción (boolean) a mayúsculas o a minúsculas e imprimir la cadena resultante.
        System.out.println("\nEjercicio 2");
        System.out.println("Introduce una cadena");
        String cadena = scan2.nextLine();
        System.out.print("Quieres pasarlo a Mayuscula (true) o a minuscula (false)? ");
        boolean respuesta = scan1.nextBoolean();
        if (respuesta) {
            cadena = cadena.toUpperCase(Locale.ROOT);
        } else {
            cadena = cadena.toLowerCase(Locale.ROOT);
        }
        System.out.println(cadena);

        //3- Crear un programa que lea una cadena y una palabra,
        // y que nos diga la posición de dicha palabra en la frase.
        // Si no la encuentra que devuelva un 0.
        System.out.println("\nEjercicio 3");
        System.out.println("Introduce una cadena");
        String cadenaGrand = scan2.nextLine();
        System.out.println("Introduce la palabra que quieres encontrar en esa cadena");
        String encontrar = scan1.next();
        int pos = cadenaGrand.indexOf(encontrar);
        if (pos >= 0) {
            System.out.println("la palabra que buscas esta en la posicion " + (pos + 1));
        } else {
            System.out.println(pos + 1);
        }
        //4- Introducir una cadena de caracteres, y después muestre un mensaje indicando:
        //a) Si la cadena introducida tiene menos de 5 caracteres, entre 5 y 15 caracteres o más de 15 caracteres.
        System.out.println("\nEjercicio 4");
        System.out.println("Introduce una cadena");
        String cadena4 = scan2.nextLine();

        if ((cadena4.length()) < 5) {
            System.out.println("Tiene menos de 5 caracteres");
        } else if ((cadena4.length()) <= 15) {
            System.out.println("Tiene entre 5 y 15 caracteres");
        } else {
            System.out.println("Tiene mas de 15 Caracteres");
        }
        //b) Si la cadena introducida comienza por la letra 'a'.
        if (cadena4.charAt(0) == 'a') {
            System.out.println("La primera letra es 'a'");
        }
            /*
        5 - Introduzca una frase en la consola y una vocal, y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.
*/
        System.out.println("\nEjercicio 5");
        System.out.println("Introduce una cadena");
        String ej5 = scan1.nextLine();
        System.out.println("introduce una vocal");
        String vocal = scan2.nextLine();
        String sust = vocal.toUpperCase();
        for (int i = 0; i < ej5.length(); i++) {
            if (ej5.charAt(i)==vocal.charAt(0)){
                ej5 = ej5.replace(ej5.charAt(i),sust.charAt(0));
            }
        }
        System.out.println(ej5);
        System.out.println(sust);

        /*
        6 - Introduzca por pantalla un número de una, dos o tres cifras y almacenalo en un string, obligando al usuario a que el valor introducido sea numérico.
        Después imprima por pantalla si el número tiene una, dos o tres cifras.
        */

        System.out.println("\nEjercicio 6");
        boolean comp = false;
        String numero = "";
        do {
            do {
                System.out.println("Introduce una cadena numérica de 1, 2 o 3 cifras");
                numero = scan1.nextLine();
            } while (numero.length() > 3 || numero.length() == 0);

            for (int i = 0; i < numero.length(); i++) {
                if (numero.charAt(i) >= '0' && numero.charAt(i) <= '9') {
                    comp = false;
                } else {
                    comp = true;
                    break;
                }
            }
        } while ((comp));
        if (numero.length() == 1) {
            System.out.println("Tiene 1 cifra");
        } else if (numero.length() == 2) {
            System.out.println("Tiene 2 cifras");
        } else {
            System.out.println("Tiene 3 cifras");
        }
    }
}