public class Bruch {

    // Instanzvariablen für Zähler und Nenner
    private int zaehler;
    private int nenner;

    // Konstruktor für Bruch
    public Bruch(int zaehler, int nenner) {
        // prüft, ob der Nenner gleich 0 ist
        if (nenner == 0) {
            System.out.println("Es darf nicht durch 0 geteilt werden.");
            System.exit(0);
        }

        // Werte setzen
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    // gibt den Zähler zurück
    public int getZaehler() {
        return this.zaehler;
    }

    // gibt den Nenner zurück
    public int getNenner() {
        return this.nenner;
    }

    // Addition von zwei Brüchen
    public Bruch add(Bruch f) {
        // berechnet den Zähler
        int newZaehler = (zaehler * f.nenner) + (f.zaehler * nenner);
        // berechnet den Nenner
        int newNenner = (f.nenner * nenner);

        // erzeugt neues Bruch-Objekt und gibt dieses zurück
        return new Bruch(newZaehler, newNenner);
    }

    // Multiplikation von zwei Brüchen
    public Bruch multiply(Bruch f) {
        // berechnet den Zähler
        int newZaehler = (zaehler * f.zaehler);

        // berechnet den Nenner
        int newNenner = (nenner * f.nenner);

        // erzeugt neues Bruch-Objekt und gibt dieses zurück
        return new Bruch(newZaehler, newNenner);
    }

    // gibt Zähler und Nenner als String zurück
    public String toString() {
        return zaehler + "/" + nenner;
    }

}