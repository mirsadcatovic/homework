package zadatak2;

public class Tehnicar extends Zaposleni {
    /*# Tehnicar
        Tehnicar je `Zaposleni` koji ima referencu na doktora za kojeg radi.
        Referenca na doktora za kojeg radi moze da se dohvati i postavi
*/
    private Doktor refDoktora;

    public Tehnicar(String naziv, String jmbg, int godRodjenja) {
        super(naziv, jmbg, godRodjenja);
    }

    public Doktor getRefDoktora() {
        return refDoktora;
    }

    public void setRefDoktora(Doktor refDoktora) {
        this.refDoktora = refDoktora;
    }


    //  Ispis: Tehnicar: [Zaposleni] radi za `Doktor`
    @Override
    public String toString() {
        return "Tehnicar: [" + super.toString() + "] radi za " + getRefDoktora();
    }
}
