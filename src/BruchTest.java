public class BruchTest {
    public static void main(String[] args) {

        // Testbrüche
        Bruch a = new Bruch(5,3);
        Bruch f = new Bruch(2, 2);

        // Ausgabe der Brüche zur Berechnung
        System.out.println("Bruch 1: " + a);
        System.out.println("Bruch 2: " + f + '\n');

        // Bruchberechnung: Addition
        Bruch ergebnisBruchAddition = a.add(f);
        System.out.println("Ergebnis Addition: ");
        System.out.println(ergebnisBruchAddition.toString()  + '\n');

        // Bruchberechnung: Multiplikation
        Bruch ergebnisBruchMultiplikation = a.multiply(f);
        System.out.println("Ergebnis Multiplikation: ");
        System.out.println(ergebnisBruchMultiplikation.toString());

    }
}
