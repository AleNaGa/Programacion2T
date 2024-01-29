public class EjerciciosMetodos {
    public static void main(String[] args) {
        //18.	Crear un método estático que reciba un String, y lo devuelva del revés.
       // 19.	Crear un método estático que reciba un String,
        // y compruebe si es un palíndromo. Debe usar el método del ejercicio anterior.
        //23.	Crear un método estático que reciba
        // un array de algún tipo primitivo y lo imprima por pantalla.
        //24.	Cree un método que reciba un array de enteros,
        // y por cada entero del array imprima su tabla de multiplicar.
        int [] numeros = {1,2,3,4,5,6,7,8,9};
        multiplicarArray(numeros);

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
