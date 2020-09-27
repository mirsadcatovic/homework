package zadatak1;

public class Zaposleni{

    /*Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen.
      Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].
    */

    private String imeIPrezime;
    private Pozoriste nazivPozorista;

    public Zaposleni(String imeIPrezime, Pozoriste nazivPozorista) {
        this.imeIPrezime = imeIPrezime;
        this.nazivPozorista = nazivPozorista;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public Pozoriste getNazivPozorista() {
        return nazivPozorista;
    }

    @Override
    public String toString() {
        return imeIPrezime + "[" + nazivPozorista + "]";
    }
}
