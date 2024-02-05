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
    public static int [] rellenarArrayRandom (){
        int tamaño = aleatorio(5,15);
        int [] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = aleatorio(1,9);
        }
        return array;
    }
    public static int aleatorio (int max, int min){
        return (int) (Math.random() * ((max-min) + 1) + min);
    }
    public static int [] anadirValor (int [] array, int entero, int posicion){
        int [] nuevoArray = new int[array.length + 1];
        int contador = 0;
        for (int i = 0; i < array.length + 1; i++) {
            if(i == posicion){
                nuevoArray[i] = entero;
            }
            else{
                nuevoArray[i] = array[contador];
                contador++;
            }
        }
        return nuevoArray;
    }
    public static boolean comprobacion (int numero, int limite){
        if (numero < limite)return true;
        else return false;
    }
    public static void intercambiarValoresArray(int[] arrayPrimero, int[] arraySegundo, int entero, int posicion1, int posicion2) {
        System.out.println(entero);
        System.out.println(posicion1);
        System.out.println(posicion2);
        if (comprobacion(entero, arrayPrimero.length) && comprobacion(entero, arraySegundo.length) && comprobacion(posicion1 + entero, arrayPrimero.length) && comprobacion(posicion2 + entero, arraySegundo.length)) {
            for (int i = 0; i < entero; i++) {
                arrayPrimero[posicion1 +i ] = arraySegundo[posicion2 + i];

            }
        } else System.out.println("se ha salido del limite");
    }
}
