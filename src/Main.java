import Es2.Call;
import Es2.eCommerce_Sim;

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

        System.out.println("Stampa di due rettangoli:");
        Rettangolo.stampaDueRettangoli(r1, r2);


        //__________________________________________________

        eCommerce_Sim s1 = new eCommerce_Sim("3289567344");


        Call c1 = new Call("3456789098", 4.6);
        Call c2 = new Call("3456744444", 2.1);
        /*c1.lastCall();*/
        s1.effettuaChiamata(c1);
        s1.effettuaChiamata(c2);
        s1.stampaDatiSim();


    }
}