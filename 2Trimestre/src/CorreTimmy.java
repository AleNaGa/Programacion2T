import java.util.Scanner;

public class CorreTimmy {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        boolean fin = true;
        int iPosT = 1;
        int jPosT = 1;
        int iPosH = 18;
        int jPosH = 18;
        int jmuros = (int)Math.floor(Math.random()*17)+1;
        String mov;
        while(fin){
        for (int i = 0; i <= 19; i++) {
            System.out.println();
            for (int j = 0; j <= 19; j++) {
                if (j==0 || j==19 || i==0 || i==19){
                    System.out.print("* ");
                }
                else{
                    if(i== iPosT && j== jPosT){
                        System.out.print("T ");
                    }
                    else if (i== iPosH && j== jPosH){
                        System.out.print("H ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
        }
            System.out.print("\nA donde se mueve Timmy ahora?: ");
            mov = scan1.next();
            switch(mov){
                case "w": iPosT--;break;
                case "s": iPosT++;break;
                case "d": jPosT++;break;
                case "a": jPosT--; break;
                case "stop": fin = false; break;
            }
            if (iPosT==iPosH && jPosT==jPosH){
                fin = false;
                System.out.println("Timmy ha llegado!!");
            }
            else if (iPosT==0 || jPosT==0 || iPosT==19 || jPosT==19){
                System.out.println("TIMMY HA MUERTO");
                fin = false;
            }
            else{
            }
        }
        System.out.println("Juego terminado");
    }
}
