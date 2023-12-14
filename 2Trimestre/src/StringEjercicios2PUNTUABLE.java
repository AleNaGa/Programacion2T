import java.util.Locale;
import java.util.Scanner;

public class StringEjercicios2PUNTUABLE {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        // 11.
        System.out.println("\n Ejercicio 11");
        System.out.print("Introduce una cadena de caracteres: ");
        String ej11 = scan1.nextLine();
        ej11 = ej11.toLowerCase(Locale.ROOT);
        System.out.println(ej11);
        ej11 = ej11.replace("a", "");
        ej11 = ej11.replace("e", "");
        ej11 = ej11.replace("i", "");
        ej11 = ej11.replace("o", "");
        ej11 = ej11.replace("u", "");
        System.out.println(ej11);

        //12
        System.out.println("\n Ejercicio 12");
        System.out.print("Introduce Supermercado: ");
        String ej12 = scan2.nextLine();
        //Método con Contains
        if(ej12.contains("m")){
            System.out.println("Contiene m");
        }
        //Método con Index
        if(ej12.indexOf("m")>=0){
            System.out.println("Contiene m");
        }
        //Método con Contains
        if(ej12.contains("M")){
            System.out.println("Contiene M");
        }
        //Método con Index
        if(ej12.indexOf("M")>=0){
            System.out.println("Contiene M");
        }

        //13
        System.out.println("\n Ejercicio 13");
        System.out.print("Introduce una cadena: ");
        String ej131 = scan1.nextLine();
        System.out.print("Introduce una cadena: ");
        String ej132 = scan2.nextLine();
        int comparacion = ej131.compareTo(ej132);
        System.out.println(comparacion);
        if (comparacion==0){
            System.out.println("Son Iguales");
        }
        else if (comparacion<0){
            System.out.println("La Primera va antes");
        }
        else{
            System.out.println("La segunda va antes");
        }

        //14
        System.out.println("\n Ejercicio 14");
        comparacion = ej131.compareToIgnoreCase(ej132);
        if (comparacion==0){
            System.out.println("Son Iguales");
        }
        else if (comparacion<0){
            System.out.println("La Primera va antes");
        }
        else{
            System.out.println("La segunda va antes");
        }

        //15
        System.out.println("\n Ejercicio 15");
        System.out.print("Introduce una cadena: ");
        String ej151 = scan1.nextLine();
        System.out.print("Introduce una cadena: ");
        String ej152 = scan2.nextLine();
        boolean comp = ej151.equals(152);
        if (comp){
            System.out.println("Son Iguales");
        }
        else{
            System.out.println("Son Distintos");
        }

        //16
        System.out.println("\n Ejercicio 16");
        comp = ej151.equalsIgnoreCase(ej152);
        if (comp){
            System.out.println("Son Iguales ignorando mayúsculas");
        }
        else{
            System.out.println("Son Distintos ignorando mayúsculas");
        }

        //17
        System.out.println("\n Ejercicio 17");
        System.out.print("Introduce un caracter: ");
        char ej17 = scan1.nextLine().charAt(0);
        System.out.println((int)ej17);

        //18
        System.out.println("\n Ejercicio 18");
        System.out.print("Introduce un número de dos cifras: ");
        String ej18 = scan1.nextLine();
        int num = Integer.parseInt(ej18);
        System.out.println((char)num);

        //19
        System.out.println("\n Ejercicio 19");
        String contrasenya = "12345678";
        String prueba = "";
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce la contraseña: ");
            prueba = scan2.nextLine();

            if (prueba.equals(contrasenya)){
                System.out.println("Logged In");
                break;
            }
            else if (i<2){
                System.out.println("Prueba otra vez...");
            }
        }
        if (!(prueba.equals(contrasenya))){
            System.out.println("ERROR");
        }

        //22
        System.out.println("\n Ejercicio 22");
        System.out.print("Introduce una nueva contrasña para tu cuenta: ");
        String contrs22 = scan2.nextLine();
        System.out.print("LA SEGURIDAD ");
        //si la longitud es < 5 es débil:
        if (contrs22.length()<5){
            System.out.print("ES DEBIL!");
        }
        else {
            //si es superior o igual a 5, solo tiene números o letras es media:ç
            //Creamos un método para contar cuántas letras hay antes de un número
            int cont = 0;
            for (int i = 0; i < contrs22.length(); i++) {
                char c = contrs22.charAt(i);
                if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                    cont++;
                } else {
                    break;
                }
            }
            //si el contador es 0, todo son números por lo que es media
            if (cont == 0) {
                System.out.print("ES MEDIA!");
            }
            //si el contador es el tamaño del string todo son letras
            else if (cont == contrs22.length()) {
                System.out.println("ES MEDIA!");
            }
            //si el cont es mayor que 0 y mayor que el tamaño del String,
            // tiene letras y números con lo cual es alta
            else{
                System.out.println("ES ALTA!");
            }
        }
    }
}
