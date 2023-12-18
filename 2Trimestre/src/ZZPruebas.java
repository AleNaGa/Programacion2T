import java.util.Scanner;

public class ZZPruebas {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("HolaMundo1");
<<<<<<< Updated upstream

=======
        System.out.print("Introduce una cadena de Caracteres");
        String ej6 = scan.next();
        for (int i = 0; i < ej6.length(); i++) {
            int ascii = (char)ej6.charAt(i) - 32;
            System.out.print((char) ascii);
        }
>>>>>>> Stashed changes
    }
}
