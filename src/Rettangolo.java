public class Rettangolo {
    private int altezza;
    private int lunghezza;

    // Costruttore
    public Rettangolo(int altezza, int lunghezza){
        this.altezza = altezza;
        this.lunghezza = lunghezza;
    }

    // Metodo per calcolare l'area
    private int calcArea(){
        return altezza * lunghezza;
    }

    // Metodo per calcolare il perimetro
    private int calcPerimetro(){
        return 2 * (altezza + lunghezza);
    }

    // Metodo statico per stampare i dati del rettangolo
    public static String stampaRettangolo(Rettangolo r) {
        return "Area rettangolo: " + r.calcArea() + " | Perimetro rettangolo: " + r.calcPerimetro();
    }

    // Metodo statico per stampare due rettangoli
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2 ) {
        // Stampa del primo rettangolo
        System.out.println("Primo rettangolo");
        System.out.println(stampaRettangolo(r1));  // Chiamiamo stampaRettangolo statico

        // Stampa del secondo rettangolo
        System.out.println("Secondo rettangolo");
        System.out.println(stampaRettangolo(r2));  // Chiamiamo stampaRettangolo statico

        // Somma delle aree e dei perimetri
        int sommaAree = r1.calcArea() + r2.calcArea();
        int sommaPerimetri = r1.calcPerimetro() + r2.calcPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}


