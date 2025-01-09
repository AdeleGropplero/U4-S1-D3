package Es2;

public class Call {
    private double minutes;
    private String numberIn;

    public Call(String numberIn, double minutes) {
        this.numberIn = numberIn;
        this.minutes = minutes;
    }

    public void lastCall(){
        System.out.println("Chiamata da: " + this.numberIn + " Durata: " + this.minutes + " min");
    }
}
