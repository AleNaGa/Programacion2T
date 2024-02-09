import java.util.Scanner;

public class MathTraining {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        boolean jugar = true;
        int record = 0;
        int tiempoRecord = 0;
        int valor1 = 0;
        int valor2 = 0;
        int operandoNumero = 0;
        char operando = '+';
        System.out.print("-------------------------- \n Bienvenido a Math Training \n -------------------------- \n ¿Desea jugar? (Si/No): ");
                String respuesta = scan.next();
                if(respuesta.equalsIgnoreCase("si")){
                    jugar = true;
                }
                else{
                    jugar = false;
                }
        while(jugar){
                System.out.println("\n3 =========== \n2 =========== \n1 =========== \nVamos que nos vamos ..... \n--------------------------");
                valor1 = (int) Math.floor( Math.random() * 100 );
                valor2 = (int) Math.floor( Math.random() * 100 );
                operandoNumero = (int) Math.floor( Math.random() * 4 );
                switch (operandoNumero){
                    case 0:operando = '+';
                    case 1:operando = '-';
                    case 2:operando = '*';
                    case 3:operando = '/';
                    case 4:operando = '%';
                }

            }
        System.out.println("--------------------------\nHa finalizado el juego\n--------------------------");
        System.out.println("Record de aciertos en esta sesion: " + record + " en " + tiempoRecord + " segundos.");


    }

}
