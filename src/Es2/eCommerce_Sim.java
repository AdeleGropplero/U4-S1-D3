package Es2;

import java.util.Arrays;

public class eCommerce_Sim {

    private String number;
    private double credit;
    private Call[] lastCalls;

    // Costruttore della classe eCommerce_Sim
    public eCommerce_Sim(String number) {
        this.number = number;
        this.credit = 0;
        this.lastCalls = new Call[5];
    }

    public  void  stampaDatiSim(){

        System.out.println("Sim numero: " + this.number);
        System.out.println("credito: " + this.credit + "€");
        /*System.out.println("Ultime chiamate: " + Arrays.toString(this.lastCalls));*/
        for (int i = 0; i < lastCalls.length; i++) {
            if (lastCalls[i] != null){
                lastCalls[i].lastCall();
            }

        }

    }

    public void effettuaChiamata(Call c){
        for (int i = 0; i < this.lastCalls.length; i++) {
            if (this.lastCalls[i] == null){
                this.lastCalls[i] = c;
                return;
            }/*else {
                this.lastCalls[4] = c;
            }*/

        }
    }
}


