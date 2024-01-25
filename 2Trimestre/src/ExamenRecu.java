import java.util.Scanner;

public class ExamenRecu {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        /*
        System.out.println("\n Ejercicio 1");
        for (int i = 0; i <= 100; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }
            else if (i%3==0 ){
                System.out.println("fizz");
            }
            else if (i%5==0){
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }



        System.out.println("\n Ejercicio 2");
        System.out.print("Introduzca un anyo: ");
        int anyo = scan.nextInt();
        boolean p = anyo%4==0;
        boolean q = anyo%100==0;
        boolean r = anyo%400==0;
        boolean apartadoA = (p && !q) || r;
        boolean apartadoB = p && (!q || r);
        System.out.println("Apartado a)" + apartadoA);
        System.out.println("Apartado b)" + apartadoB);
*/
        System.out.println("\n Ejercicio 3");
        boolean menu = true;
        do {
            System.out.println("\nElija un ejercicio: ");
            System.out.println("Opción 1: Ejercicio 1");
            System.out.println("Opción 2: Ejercicio 2");
            System.out.println("Cualquier otro numero termina el programa");
            System.out.print("Introduzca la opción que desea: ");
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("\n Ejercicio 1");
                    for (int i = 0; i <= 100; i++) {
                        if (i%3==0 && i%5==0){
                            System.out.println("fizzbuzz");
                        }
                        else if (i%3==0 ){
                            System.out.println("fizz");
                        }
                        else if (i%5==0){
                            System.out.println("buzz");
                        }
                        else{
                            System.out.println(i);
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("\n Ejercicio 2");
                    System.out.print("Introduzca un anyo: ");
                    int anyo = scan1.nextInt();
                    boolean p = anyo%4==0;
                    boolean q = anyo%100==0;
                    boolean r = anyo%400==0;
                    boolean apartadoA = (p && !q) || r;
                    boolean apartadoB = p && (!q || r);
                    System.out.println("Apartado a)" + apartadoA);
                    System.out.println("Apartado b)" + apartadoB);
                    break;
                }
                default: {
                    System.out.println("Ha salido del programa");
                    menu = false;
                    break;
                }
            }
        }while (menu);
    }
}
