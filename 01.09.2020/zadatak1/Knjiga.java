package zadatak1;

public class Knjiga {
    /*Knjiga poseduje naziv, AUTORA (TIPA Autor),
    broj strana, godinu izdanja.
    Sva polja mogu da se dohvate,
    a godina izdanja moze i da se postavi
    */

    private String naziv;
    private int brStrana;
    private Autor a;
    private int godIzdavanja;

    public Knjiga(String naziv, int brStrana, int godIzdavanja, Autor a) {
        this.naziv = naziv;
        if (brStrana > 0) {
            this.brStrana = brStrana;
        }
        if (godIzdavanja < 2021) {
            this.godIzdavanja = godIzdavanja;
        }
        this.a = a;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getBrStrana() {
        return brStrana;
    }

    public Autor getA() {
        return a;
    }

    public int getGodIzdavanja() {
        return godIzdavanja;
    }

    public void setGodIzdavanja(int godIzdavanja) {
        if (godIzdavanja < 2021) {
            this.godIzdavanja = godIzdavanja;
        }
    }
}
