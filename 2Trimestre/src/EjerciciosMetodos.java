public class EjerciciosMetodos {
    public static void main(String[] args) {



    }
    public static int[] rellenarArrayRandom() {
        int tamaño = aleatorio(10, 5);
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = aleatorio(1, 9);
        }
        return array;
    }

    public static int aleatorio(int max, int min) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public static void imprimirArraysInt(int[] array) {
        for (int var : array) {
            System.out.print(var + " ");
        }
        System.out.println("");
    }
}
