package zadatak2;

public class Doktor extends Zaposleni {
    /*# Doktor
    Doktor je `Zaposleni` koji ima naziv fakulteta.
    Naziv fakulteta se zadaje prilikom kreiranja i moze da se dohvati i postavi
    */

    private String nazivFakulteta;

    public Doktor(String naziv, String jmbg, int godRodjenja, String nazivFakulteta) {
        super(naziv, jmbg, godRodjenja);
        this.nazivFakulteta = nazivFakulteta;
    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }

    // Ispis: Doktor [Zaposleni] - Fakultet
    @Override
    public String toString() {
        return "Doktor: [" + super.toString() + "] - " + getNazivFakulteta();
    }
}
