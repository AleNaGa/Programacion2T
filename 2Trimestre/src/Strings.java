import java.util.Locale;

public class Strings {
    public static void main (String [] args){
        // .length(); .charAt();

        String hola1 = "hola mundo";

        for (int i = 0; i < hola1.length(); i++) {
            System.out.print(hola1.charAt(i));
        }
        System.out.println("\n ");
/*
     //Substring
        String tele = "Televisión";
        System.out.println(hola1.substring(2));
        System.out.println(hola1.substring(3,8));
        System.out.println(tele.substring(1,4));
        System.out.println(tele.substring(2));
        System.out.println(tele.substring(9));
*/
        // ejercicio

        System.out.println(hola1.substring(0, hola1.length()/2));
        System.out.println(hola1.substring(hola1.length()/2));


        System.out.println("\n\n ");
        //ejercicio index of
        int espacio = hola1.indexOf(" ");
        System.out.println(hola1.substring(0,espacio));
        System.out.println(hola1.substring(espacio+1));


        //equals
        System.out.println("\n\n ");
        String cadena1 = "J";
        String cadena2 = "H";
        System.out.println(cadena1.equalsIgnoreCase(cadena2));
        System.out.println(cadena1.compareTo(cadena2));
        int h = (int) 'H';
        int h2 = (int) 'I';
        System.out.println(h + " " + h2);


        //Trim
        String trim1 = " 6766886        ";
        System.out.println(trim1.trim());


        //Replace
        String replace = "Hola como estás";
        System.out.println(replace.replace(' ', ','));

        //lower upper case
        String caso = "HOLA";
        System.out.println(caso.toLowerCase(Locale.ROOT));

        // strings a Numeros
        String s = "" + 2;
        String s1 = Integer.toString(2);
        String s3 = Double.toString(3.3333);
        String s4 = String.valueOf(50);
        String s5;


        // parsear
        String pars = "1029.1212";
        
    }

}
