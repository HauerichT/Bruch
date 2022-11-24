public class Bruch {

    private int zaehler;
    private int nenner;

    public Bruch (int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZaehler() {
        return this.zaehler;
    }
    public int getNenner() {
        return this.nenner;
    }

    public Bruch add (Bruch f) {
        int newZaehler = (zaehler * f.nenner) + (f.zaehler * nenner);
        int newNenner = (f.nenner * nenner);

        return new Bruch(newZaehler, newNenner);
    }

    public Bruch multiply (Bruch f) {
        int newZaehler = (zaehler * f.zaehler);
        int newNenner = (nenner * f.nenner);

        return new Bruch(newZaehler, newNenner);
    }

    public String toString () {
        return zaehler + "/" + nenner;
    }


}