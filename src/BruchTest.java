public class BruchTest {
    public static void main(String[] args) {

        Bruch a = new Bruch(5,3);
        Bruch f = new Bruch(2, 2);

        Bruch ergebnisBruchAddition = a.add(f);
        System.out.println(ergebnisBruchAddition.toString());

        Bruch ergebnisBruchMultiplikation = a.multiply(f);
        System.out.println(ergebnisBruchMultiplikation.toString());

    }
}
