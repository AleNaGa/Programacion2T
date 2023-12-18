import java.util.Scanner;

public class StringEjercicios2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);


        // 1.	Lee por pantalla una cadena de caracteres
        // e imprime su longitud.
        System.out.println("\n Ejercicio1");
        System.out.print("Introduce una cadena de caracteres: ");
        String ej1 = scan1.nextLine();
        System.out.println(ej1.length());

       // 2.	Lee por pantalla una cadena de caracteres
        // e imprime su primera letra.
        System.out.println("\n Ejercicio2");
        System.out.print("Introduce una cadena de caracteres: ");
        String ej2 = scan2.nextLine();
        System.out.println(ej2.charAt(0));

       // 3.	Lee por pantalla una cadena de caracteres
        // e imprime su última letra. Ten en cuenta que la cadena introducida puede cambiar en cada ejecución.
        System.out.println("\n Ejercicio3");
        System.out.print("Introduce una cadena de caracteres: ");
        String ej3 = scan1.nextLine();

        System.out.println(ej3.charAt(ej3.length() -1));

       // 4.	Lee por pantalla una cadena de caracteres
        // e imprime la letra central o su aproximada.
        System.out.println("\n Ejercicio4");
        System.out.print("Introduce una cadena de caracteres: ");
        String ej4 = scan2.nextLine();
        System.out.println(ej4.charAt(ej4.length()/2));

      // 5.	Repite los tres ejercicios anteriores imprimiendo junto
        // a la letra su código UNICODE, separados por un espacio.
        System.out.println("\n Ejercicio5");
        System.out.print(ej2.charAt(0) + " ");
        System.out.println((int)ej2.charAt(0));
        System.out.print(ej3.charAt(ej3.length() -1 ) + " ");
        System.out.println((int)ej3.charAt(ej3.length() -1 ));
        System.out.print(ej4.charAt(ej4.length()/2) + " ");
        System.out.println((int)ej4.charAt(ej4.length()/2));

        //6.	Lee por pantalla una cadena de caracteres, y vuelve
        // a imprimirla en mayúsculas.
        System.out.println("\n Ejercicio6");
        System.out.print("Introduce una cadena de Caracteres en minusculas: ");
        String ej6 = scan1.nextLine();
        for (int i = 0; i < ej6.length(); i++) {
            int ascii = (char)ej6.charAt(i) - 32;
            System.out.print((char) ascii);
        }
       // 7.	Lee por pantalla una cadena de caracteres,
        // e imprímela en minúsculas.
        System.out.println("\n Ejercicio7");
        System.out.print("Introduce una cadena de Caracteres en Mayúsculas: ");
        String ej7 = scan2.nextLine();
        for (int i = 0; i < ej7.length(); i++) {
            int ascii = (char)ej7.charAt(i) + 32;
            System.out.print((char) ascii);
        }
       // 8.	Lee por pantalla una cadena de caracteres
        // y reemplaza todas las aes por espacios en blanco.
        System.out.println("\n Ejercicio8");
        System.out.print("Introduce una cadena: ");
        String ej8 = scan1.nextLine();
        System.out.println(ej8.replace('a',' '));
       // 9.	Lee por pantalla una cadena de caracteres
        // y elimina todas las aes.
        System.out.println("\n Ejercicio9");
        System.out.print("Introduce una cadena: ");
        String ej9 = scan2.nextLine();
        System.out.println(ej9.replace("a",""));
       // 10.	Lee por pantalla una cadena de caracteres
        // y reemplaza las vocales por espacios en blanco.
        System.out.println("\n Ejercicio10");
        System.out.println("Introduce una cadena: ");
        String ej10 = scan1.nextLine();
        ej10.replace('a',' ');
        ej10.replace('e',' ');
        ej10.replace('i',' ');
        ej10.replace('o',' ');
        ej10.replace('u',' ');
    }
}