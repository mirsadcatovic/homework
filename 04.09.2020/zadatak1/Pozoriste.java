package zadatak1;

import java.util.UUID;

public class Pozoriste {
    /*Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv koji mogu da se dohvate.
      Moze da se sastavi tekstualni opis u obliku naziv[id].
    */

    private String nazivPozorista;
    private static int UUID = 0;
    private int id;

    public Pozoriste(String nazivPozorista) {
        this.nazivPozorista = nazivPozorista;
        this.id = UUID++;
    }

    public String getNazivPozorista() {
        return nazivPozorista;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nazivPozorista + "[" + id + "]";
    }
}
