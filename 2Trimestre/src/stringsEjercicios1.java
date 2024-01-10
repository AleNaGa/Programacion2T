import java.util.Scanner;

public class stringsEjercicios1 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
/*
        System.out.println("\nEjercicio1");
        // Un String que contenga tu nombre y un mensaje de bienvenida.
        String nombre = "Alejandro";
        System.out.println("Bienvenido " + nombre);

        System.out.println("\nEjercicio2");
        //Ahora que te pida tu nombre
        System.out.print("Introduce tu nombre: ");
        nombre = scan.next();
        System.out.println("Bienvenido " + nombre);

        System.out.println("\nEjercicio3");
        //Aplicación con String contraseña. 3 intentos
        //Cuando aciertes no pedirá más la contraseña
        String contrasena = "password";
        String contrasena1;
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce la contraseña: ");
            contrasena1 = scan.next();
            if (contrasena.equalsIgnoreCase(contrasena1)){
                break;
                System.out.println("Contraseña correcta");
            }
        }


        System.out.println("\nEjercicio4");
        //Del String "La lluvia en Sevilla es una maravilla" cuenta las vocales
        String lluvia = "La lluvia en Sevilla es una maravilla";
        int cont = 0;
        for (int i = 0; i < lluvia.length(); i++) {
            char letra = lluvia.charAt(i);
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    cont++;
                default:
            }
        }
        System.out.println("hay " + cont + " vocales");

        System.out.println("\nEjercicio5");
        // reemplaza todas las a por e
        String lluviaReplace = lluvia.replace('a', 'e');
        System.out.println(lluviaReplace);

        System.out.println("\nEjercicio6");
        // Dada una cadena mostrar cantidades de vocales.
        System.out.print("Introduce una cadena: ");
        String cad = scan.next();
        int cont2 = 0;
        for (int i = 0; i < cad.length(); i++) {
            char letra = cad.charAt(i);
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    cont2++;
                default:
            }
        }
        System.out.println("hay " + cont2 + " vocales");

        System.out.println("\nEjercicio7");
        // Invertir una cadena
        System.out.print("Introduce una cadena para invertir");
        String cadena = scan.next();
        String cadenaInv = "";
        for (int i = 0; i < cadena.length(); i++) {
            char almac = cadena.charAt(i);
            cadenaInv = almac + cadenaInv;
        }
        System.out.println(cadenaInv);

        System.out.println("\nEjercicio8");
        // Una cadena y un caracter cuenta cuantas veces se repite.
        System.out.print("Introduce una cadena: ");
        String cadena8 = scan.nextLine();
        System.out.print("Introduce un caracter: ");
        String caractStr = scan.nextLine();
        char caract = caractStr.charAt(0);
        System.out.println(caract);
        int cont8=0;
        for (int i = 0; i < cadena8.length(); i++) {
            char guardado8 = cadena8.charAt(i);
            if( guardado8 == caract){
                cont8++;
            }
        }
        System.out.println(cont8);

        System.out.println("\nEjercicio9");
        // pasa ASCII a char
        System.out.print("Introduce un número y verás su ASCII char: ");
        int ascii = scan.nextInt();
        char caracter = (char) ascii;
        System.out.println(caracter);

        System.out.println("\nEjercicio10");
        // pasa ASCII a char
        System.out.print("Introduce un número y verás su ASCII char: ");

        ascii = scan.nextInt();
        caracter = (char) ascii;
        System.out.println(caracter);
*/
        System.out.println("\nEjercicio11");
        String holaMundo = "HolaMundo";
        for (int i = 0; i < holaMundo.length(); i++) {
            System.out.print((int)holaMundo.charAt(i) + " ");
        }
        System.out.println("\nEjercicio12");
        System.out.println("Ingrese dos números: ");
        String num1 = scan.next();
        String num2 = scan.next();
        int ej12num1 = Integer.parseInt(num1);
        int ej12num2 = Integer.parseInt(num2);
        System.out.print("Ingrese el operando: ");
        String ej12oper = scan.next();
        double respuesta = 0;
        if("+".equals(ej12oper)){
            respuesta = ej12num1 + ej12num2;
        }
        else if("-".equals(ej12oper)){
            respuesta = ej12num1 - ej12num2;
        }
        else if("*".equals(ej12oper)){
            respuesta = ej12num1 * ej12num2;
        }
        else if("/".equals(ej12oper)){
            respuesta = ej12num1 / ej12num2;
        }
        else if("%".equals(ej12oper)){
            respuesta = ej12num1 % ej12num2;
        }
        else if("^".equals(ej12oper)){
            respuesta = Math.pow(ej12num1,ej12num2);
        }
        System.out.println(respuesta);

    }
}
