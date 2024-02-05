public class EjerciciosMetodos {
    public static void main(String[] args) {
        //18.	Crear un método estático que reciba un String, y lo devuelva del revés.
        // 19.	Crear un método estático que reciba un String,
        // y compruebe si es un palíndromo. Debe usar el método del ejercicio anterior.
        //23.	Crear un método estático que reciba
        // un array de algún tipo primitivo y lo imprima por pantalla.
        //24.	Cree un método que reciba un array de enteros,
        // y por cada entero del array imprima su tabla de multiplicar.
        //25.	Crear un método que reciba un array 1D de enteros y lo ordene. 10 1- 100

        /*29.	Crear un método que reciba dos arrays y un entero,
        y copie tantos elementos del segundo array en el primer array como
        diga el entero, comenzando desde la posición cero en ambos. Suponga
        que no se saldrá de los límites.

        30.	Repetir lo anterior, pero añadiendo un cuarto argumento,
        que indique la posición del segundo array a partir de la cual se empezará.

        31.	Repetir lo anterior, pero añadiendo un quinto argumento,
        que indique la posición del primer array a partir de la cual se empezará
         */
        int[] arrayPrimero = rellenarArrayRandom();
        imprimirArraysInt(arrayPrimero);
        int[] arraySegundo = rellenarArrayRandom();
        imprimirArraysInt(arraySegundo);
        int[] arraySumado = sumarArrays(arrayPrimero, arraySegundo);
        imprimirArraysInt(arraySumado);


    }

    public static int[] sumarArrays(int[] array1, int[] array2) {
        int[] arraySumado = new int[Math.max(array1.length, array2.length)];

        for (int i = 0, j = 0; i < arraySumado.length; i++) {
            if (i < Math.min(array1.length, array2.length)) {
                arraySumado[i] = array1[i] + array2[i];
            } else if (array1.length > array2.length) {
                arraySumado[i] = array1[i];
            } else {
                arraySumado[i] = array2[i];
            }
        }
        return arraySumado;
    }


    public static int[] concatArrays(int[] array1, int[] array2) {
        int[] arraySumado = new int[array1.length + array2.length];
        for (int i = 0, j = 0; i < arraySumado.length; i++) {
            if (i < array1.length) {
                arraySumado[i] = array1[i];
            } else {
                arraySumado[i] = array2[i - array1.length];
            }
        }
        return arraySumado;
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
