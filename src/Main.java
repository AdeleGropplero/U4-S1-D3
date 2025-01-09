import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

 /*  System.out.println("inserisci un altezza e una lunghezza:" );
        Scanner sc = new Scanner (System.in);
        int altezza = sc.nextInt();
        int lunghezza = sc.nextInt();
*/

        Rettangolo r1 = new Rettangolo(7, 8);
        System.out.println("r1 -->  " +  r1.stampaRettangolo(r1) );

        Rettangolo r2 = new Rettangolo(3, 6);

        System.out.println("\nStampa di due rettangoli:");
        Rettangolo.stampaDueRettangoli(r1, r2);

    }
}