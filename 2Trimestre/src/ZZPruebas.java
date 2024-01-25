import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZZPruebas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<String>> clase = new ArrayList<>();
        boolean seguir = true;
        do {
            System.out.print("Introduzca alumno de clase: ");
            System.out.print("Quiere continuar? 1 = si, 2 = no: ");
            int input = scan.nextInt();
            if (input == 1) {
                seguir = true;
            } else {
                seguir = false;
            }
        } while (seguir);
        System.out.print("Escriba el nombre de un companyero para saber si esta en el array: ");
        if (clase.contains(scan.next())){
            System.out.println("está");
        }
        else{
            System.out.println("no está");
        }
        System.out.println(clase);



    }
}
