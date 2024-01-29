import java.util.Scanner;

public class MetodosGuardados {
    public static char digitoEnPosicion(int numEntero, int pos) {
        return Integer.toString(numEntero).charAt(pos);
    }

    public static int posiciones(int num) {
        boolean vale = true;
        int comprobar = 0;
        int digitos = String.valueOf(num).length();
        do {
            comprobar = pedirnumeros();
            if (comprobar < 0) {
                vale = true;
            } else if (comprobar < digitos) {
                vale = false;
            } else {
                vale = true;
            }
        } while (vale);
        return comprobar;
    }

    public static int comprobarTamanyo( int valor) {
        boolean vale = false;
        int comprobar = 0;
        do {
            comprobar = valor;
            if (comprobar < 9) {
                vale = true;
            } else {
                vale = false;
            }
        } while (vale);
        return comprobar;
    }

    public static int pedirnumeros() {
        Scanner scan = new Scanner(System.in);
        boolean valido;
        int numero = 0;
        do {
            System.out.print("Introduce un numero: ");
            valido = scan.hasNextInt();
            if (valido) {
                numero = scan.nextInt();
            } else {
                System.out.println("no es un numero!!");
                String guardado = scan.nextLine();
            }
        } while (!valido);
        return numero;
    }
    public static String reverseString (String frase){
        String nuevo = "";
        for (int i = frase.length()-1; i >= 0; i--) {
            nuevo += frase.charAt(i);
        }
        return nuevo;
    }
    public static boolean palindromo (String frase){

        if (frase.length() < 2){
            System.out.println("La frase tiene que tener 3 caracteres para ser palíndromo");
            return false;
        }
        else if (reverseString(frase).equals(frase)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void multiplicarArray (int [] arrayParaMultiplicar){
        for (int var : arrayParaMultiplicar) {
            for (int i = 1; i < 11; i++) {
                System.out.println(var + " x " + i + " = " + (var*i));
            }
            System.out.println("--------------------------------------");
        }
    }
}
