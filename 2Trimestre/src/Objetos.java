import java.util.Enumeration;
import java.util.Locale;
import java.util.Scanner;

public class Objetos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //17.	Crear un método estático que reciba un número entero y una posición, y devuelva el dígito que
        //        se encuentra en dicha posición.
        int numEnt = comprobarTamanyo();
        int posicion = posiciones(numEnt);
        System.out.println(digitoEnPosicion(numEnt, posicion));
    }



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

    public static int comprobarTamanyo() {
        boolean vale = false;
        int comprobar = 0;
        do {
            comprobar = pedirnumeros();
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

}
