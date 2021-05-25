package beispielpaket;

public class Taschenrechner {

    // Eigenschaften

    // Konstruktor

    // Methoden
    public static void plus(int userZahl1, int userZahl2){
        System.out.println("Ergebnis: " + (userZahl1 + userZahl2));
    }

    public static void minus(int userZahl1, int userZahl2){
        System.out.println("Ergebnis: " + (userZahl1 - userZahl2));
    }

    public static void dividiere(int userZahl1, int userZahl2) throws Exception {
        if (userZahl2 == 0) {
            throw new Exception();
        }
        System.out.println("Ergebnis: " + (userZahl1 / userZahl2));
    }

}
