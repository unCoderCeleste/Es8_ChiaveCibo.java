/*Esercizio 8:
Domanda: Qual è l'output generato dalle istruzioni seguenti?
     int chiave = 1;
     switch (chiave + 1) {
       case 1:
        Esercizio
        System.out.println("Torta salata");
       break ;
       case 2:
        System.out.println("Torta");
       break ;
       case 3:
        System.out.println("Gelato");
       case 4:
        System.out.println("Biscotti");
       break ;
       default :
        System.out.println("Dieta");
        }
        Cosa succede se la variabile chiave viene impostata a 4 (chiave=4) ?
        L'output è:
        Torta
        con 'chiave=4:
        Dieta
        */
import java.util.Scanner;
public class Es8_ChiaveCibo {
    public static void main(String[] args) {
        Scanner cibo= new Scanner(System.in);
        System.out.println("Ingressa un numero dal 1 al 4");
        int chiave= cibo.nextInt();

        switch (chiave + 1) {
            case 1:
                System.out.println("Torta salata");
                break ;
            case 2:
                System.out.println("Torta");
                break ;
            case 3:
                System.out.println("Gelato");
                break;
            case 4:
                System.out.println("Biscotti");
                break ;
            default :
                System.out.println("Dieta");
                break;
        }
    }
}