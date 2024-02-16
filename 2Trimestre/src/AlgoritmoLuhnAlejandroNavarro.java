public class AlgoritmoLuhnAlejandroNavarro {
    public static void main (String [] args){
        long valor = 5594589764218858L;
        long valorGuard = valor; // aqui guardo el valor para no perderlo en las operaciones
        long pocket; // aqui se almacena el valor%10
        long multiplic; // este es por el que multiplicamos el pocket para almacenarlo al invertido
        long invertido = 0;
        int cont = 0;
       long digito;
        long digito2;
        long sumaDigitos = 0;
        int tipoTarjeta;
        for(; valor !=0; valor/=10, cont++); // PASO 1 bucle for para contar el número de digitos de valor
        valor = valorGuard;
        for (int i = cont; i > 0; i--) { // PASO 2 generar el valor invertido
            pocket = valor%10;
            multiplic = (long) Math.pow(10,i-1); //En el ejercicio pone que es 100 elevado a i-1 pero es 10 elevado a i-1
            invertido = invertido + pocket*multiplic;
            valor/=10;
        }
        for (int i = cont; i >0; i--) {// PASO 3 recorremos desde la ultima posicion a la primera.
            if(i%2==0){//si es par
                digito = (invertido%10)*2; //como es par el dígito se multiplica por dos y se sacan los digitos
                digito2=digito%10;
                digito=digito/10;
                sumaDigitos=sumaDigitos+digito+digito2;

            }
            else{
                digito = invertido%10;
                sumaDigitos = sumaDigitos + digito;
            }
            invertido/=10;//se va quitando la posición por la que ya hemos pasado
        }
        //PASO 4 ahora comprobamos si es número de Luhn
        if(sumaDigitos%10==0){
            System.out.println("ES UN NUMERO DE LUHN");
            //EXTRA: si es válida, comprueblo de qué marca es
            tipoTarjeta = (int) (valorGuard/Math.pow(10,cont-1));
            //así sabemos cuál es el primer dígito y por tanto el tipo de tarjeta que es
            if(tipoTarjeta==4) {System.out.println("ES VISA");}
            else if(tipoTarjeta==5) {System.out.println("Es MASTERCARD");}
            else if(tipoTarjeta==3) {System.out.println("ES AMERICAN EXPRESS");}
            else{System.out.println("no se sabe su tipo");}
        }
        else{
            System.out.println("no es un numero de Luhn.... la tarjeta no es válida");
        }
        System.out.println("------------------- FIN ------------------- ");




    }
}
