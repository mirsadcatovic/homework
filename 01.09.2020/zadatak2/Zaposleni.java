package zadatak2;

public class Zaposleni extends Osoba {
    /*# Zaposleni
        Zaposleni je `Osoba` koja poseduje i stepen strucne spreme
        Stepen strucne spreme moze da se dohvati i postavi
    */
    private double stepenStrucneSpreme;

    public Zaposleni(String naziv, String jmbg, int godRodjenja) {
        super(naziv, jmbg, godRodjenja);
    }

    public double getStepenStrucneSpreme() {
        return stepenStrucneSpreme;
    }

    public void setStepenStrucneSpreme(double stepenStrucneSpreme) {
        if (stepenStrucneSpreme == 1 || stepenStrucneSpreme == 2 || stepenStrucneSpreme == 3 || stepenStrucneSpreme == 4
                || stepenStrucneSpreme == 5 || stepenStrucneSpreme == 6.1 || stepenStrucneSpreme == 6.2 || stepenStrucneSpreme == 7.1
                || stepenStrucneSpreme == 8) {
            this.stepenStrucneSpreme = stepenStrucneSpreme;
        }
    }

    //Ispis: Zaposleni: [OSOBA] : SSS
    @Override
    public String toString() {
        return "Zaposleni: [" + super.toString() + "] : " + getStepenStrucneSpreme();
    }
}