import java.util.Scanner;

public class MathTrainingAlejandroNavarro {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);Scanner scan1 = new Scanner(System.in);
        //he inicializado casi todas las variables aquí por organizarme mejor.
        String res;
        boolean jugar = true;
        int record = 0, tiempoRecord = 0;
        int valor1, valor2;
        int operandoNumero = 0;
        char operando = '+';
        float solReal = 0;
        int contadorPreguntas = 0;
        boolean b;
        int cont = 0;
        long startTime, endTime;
        float solUsuario = 0;
        boolean validar;
        long tiempo = 0;

        System.out.print("-------------------------- \n Bienvenido a Math Training \n -------------------------- \n ¿Desea jugar? (Si/No): ");
                res = scan.next();
                if(res.equalsIgnoreCase("si")){
                    jugar = true;
                }
                else{
                    jugar = false;
                }
        while(jugar){
                System.out.println("\n3 =========== \n2 =========== \n1 =========== \nVamos que nos vamos ..... \n--------------------------");
                startTime = System.nanoTime();
                b = true;
                do {
                    valor1 = (int) Math.floor(Math.random() * 100);
                    valor2 = (int) Math.floor(Math.random() * 99 + 1);
                    operandoNumero = (int) Math.floor(Math.random() * 5);
                    contadorPreguntas++;
                    switch (operandoNumero) { // he puesto esto así porque me resultaba más fácil
                        case 0:
                            operando = '+';
                            solReal = valor1+valor2;
                            break;
                        case 1:
                            operando = '-';
                            solReal = valor1-valor2;
                            break;
                        case 2:
                            operando = '*';
                            solReal = valor1*valor2;
                            break;
                        case 3:
                            operando = '/';
                            solReal = (float) valor1/valor2;
                            break;
                        case 4:
                            operando = '%';
                            solReal = valor1%valor2;
                            break;
                        default:
                            System.out.println("algo salio mal...");
                            break;
                    }
                    System.out.println("-------------------------- ");
                    System.out.print("Pregunta " + contadorPreguntas + ": " + valor1 + " " +operando+ " " + valor2 + " = ");
                    validar = scan.hasNextInt() || scan.hasNextFloat();
                    if(validar){
                        solUsuario = scan.nextFloat();
                    }
                    else{
                        System.out.println("NO VÁLIDO");
                        String save = scan.next();
                    }
                    b=solUsuario==solReal;
                    if(b){
                        System.out.println("-------------------------- ");
                        System.out.println("HA ACERTADO!!!");
                        cont++;
                    }
                    else{
                        endTime = System.nanoTime();
                        tiempo = (endTime-startTime)/1000000000;
                        contadorPreguntas = 0;
                        System.out.println("-------------------------- ");
                        System.out.println("HA FALLADO!! la solución era: " + solReal);
                        System.out.println("-------------------------- ");
                        System.out.println("Su puntuación es de " + cont + " respuestas correctas en " + tiempo + " segundos...");
                    }
                }while(b);
                if(cont > record){
                    record = cont;
                    tiempoRecord = (int)tiempo;
                }
                else if (cont == record && tiempoRecord > tiempo){
                    tiempoRecord = (int)tiempo;
                }
            System.out.println("-------------------------- ");
            System.out.println("Record de aciertos en esta sesion: " + record + " en " + tiempoRecord + " segundos.");
            cont = 0;
            System.out.print( "--------------------------\n ¿Desea volver a jugar? (Si/No): ");
            res = scan1.next();
            if(res.equalsIgnoreCase("si")){
                jugar = true;
            }
            else{
                jugar = false;
            }
        }


        System.out.println("--------------------------\nHa finalizado el juego\n--------------------------");
        System.out.println("Record final: " + record + " en " + tiempoRecord + " segundos.");
        System.out.println("-------------------------- ");
        System.out.println("Gracias por jugar!!");


    }

}
