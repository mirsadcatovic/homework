package zadatak1;

public class Glumac extends Zaposleni {
    //Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].

    private String nazivUloge;


    public Glumac(String imeIPrezime, Pozoriste nazivPosorista, String nazivUloge) {
        super(imeIPrezime, nazivPosorista);
        this.nazivUloge = nazivUloge;
    }

    @Override
    public String toString() {
        return nazivUloge + "_" + super.toString();
    }
}
