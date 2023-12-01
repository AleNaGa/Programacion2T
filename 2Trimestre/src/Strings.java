import java.util.Locale;

public class Strings {
    public static void main (String [] args){
        // .length(); .charAt();

        String hola1 = "hola*mundo";

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
        String tele = "Televisión";
        String result = hola1 + tele;
        String result1 = hola1.concat(tele);


        System.out.println(hola1.indexOf('m'));
        System.out.println(hola1.indexOf("do"));
        System.out.println(hola1.indexOf('o',3));
        System.out.println(hola1.lastIndexOf('o'));
    }

}
