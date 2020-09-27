package zadatak1;

public class Reditelj extends Zaposleni {
    /*Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].
     */

    private String nadimak;

    public Reditelj(String imeIPrezime, Pozoriste nazivPosorista, String nadimak) {
        super(imeIPrezime, nazivPosorista);
        this.nadimak = nadimak;
    }

    @Override
    public String toString() {
        return nadimak +"_"+super.toString();
    }
}
