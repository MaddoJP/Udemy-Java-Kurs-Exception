import beispielpaket.Taschenrechner;

public class Main {
    public static void main(String[] args) {

        Taschenrechner.plus(2,4);

        // try = versuche

        // catch = fange


        try {
            Taschenrechner.dividiere(9,0);
        } catch(Exception e) {
            System.out.println("Man kann nicht durch 0 teilen");
        }

        System.out.println("Programm geht weiter!");
    }
}
