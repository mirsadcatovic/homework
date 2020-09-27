package zadatak2;

// StringBilder za proveru

public class Osoba {
    /*# Osoba
        Osoba poseduje naziv, jmbg, godinu rodjenja. Naziv, jmbg i godina rodjenja se zadaju prilikom kreiranja.
        Naziv moze da se dohvati i postavi. JMBG i godina rodjenja mogu samo da se dohvate.
    */
    private String naziv;
    private String jmbg;
    private int godRodjenja;

    public Osoba(String naziv, String jmbg, int godRodjenja) {
        this.naziv = naziv;
        if (PrveraJmbg(jmbg)) {
            this.jmbg = jmbg;
        }
        this.godRodjenja = godRodjenja;
    }

    public static boolean PrveraJmbg(String unos) {
        StringBuilder prov = new StringBuilder(unos);
        if (prov.toString().length() != 13) {
            System.out.println("JMBG mora da ima 13 cifara");
            return false;
        }
        return true;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getJmbg() {
        return jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    // Ispis: O: Naziv : JMBG @ godRodjenja
    @Override
    public String toString() {
        return "Osoba: " + getNaziv() + ": " + getJmbg() + " @ " + getGodRodjenja();
    }

    private static class StringBilder {
    }
}
