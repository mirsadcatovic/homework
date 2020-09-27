package zadatak1;

public class Autor {
    /*Autor poseduje ime, prezime, godinu rodjenja.
    Ime, prezime i godina rodjenja se zadaju prilikom kreiranja
    i ne mogu da se promene.
    */

    private String ime;
    private String prezime;
    private int godRodjenja;

    public Autor(String ime, String prezime, int godRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        if (godRodjenja <= 2020) {
            this.godRodjenja = godRodjenja;
        }
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    @Override
    public String toString() {
        return "Autor: " + getIme() + " " + getPrezime() + "; rodjen " + getGodRodjenja() + " godine.";
    }
}
