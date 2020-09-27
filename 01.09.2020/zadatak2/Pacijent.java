package zadatak2;

// StringBilder za proveru

public class Pacijent extends Osoba {
    //public static final int BrojKnjizice=11;
    /*# Pacijent
        Pacijent je `Osoba` koja poseduje broj knjizice (LIB).
        Broj knjizice se zadaje prilikom kreiranja i moze da se dohvati i postavi
        */
    private String brojKnjizice;

    public Pacijent(String naziv, String jmbg, int godRodjenja, String brojKnjizice) {
        super(naziv, jmbg, godRodjenja);
        if (PrveraKnizice(brojKnjizice)) {
            this.brojKnjizice = brojKnjizice;
        }
    }

    public String getBrojKnjizice() {
        return brojKnjizice;
    }

    public void setBrojKnjizice(String brojKnjizice) {
        if (PrveraKnizice(brojKnjizice)) {
            this.brojKnjizice = brojKnjizice;
        }
    }

    public static boolean PrveraKnizice(String unos) {
        StringBuilder prov = new StringBuilder(unos);
        if (prov.toString().length() != 11) {
            System.out.println("LIB mora da ima 11 cifara");
            return false;
        }
        return true;
    }

    // Ispis: Pacijent: [OSOBA] - LIB
    @Override
    public String toString() {
        return "Pacijent: [" + super.toString() + "] - " + getBrojKnjizice();
    }
}