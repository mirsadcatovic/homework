package zadatak1;

import java.util.ArrayList;

public class Predstava extends Pozoriste {
    /*Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
      Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
      Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava
      razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
    */

    private String nazivPredstave;
    private ArrayList<Zaposleni> zaposleniNaPredstavi = new ArrayList<>();

    public Predstava(String nazivPredstave, String nazivPozorista) {
        super(nazivPozorista);
        this.nazivPredstave = nazivPredstave;
    }

    public void dodajZaposleniNaPredstavi(Zaposleni z) {
        zaposleniNaPredstavi.add(z);
    }

    public void ukloniZaposleniNaPredstvi(Zaposleni z) {
        zaposleniNaPredstavi.remove(z);
    }

    public int brojZaposlenihNaPredstavi() {
        return zaposleniNaPredstavi.size();
    }

    public String getNazivPredstave() {
        return nazivPredstave;
    }

    public Zaposleni getZaposleniNaPredstavi(int i) { // ako bi se trazio pojedinacni zaposleni
        return zaposleniNaPredstavi.get(i);
    }

    public void spisakSvihZaposlenih(){
        for(int i=0; i<zaposleniNaPredstavi.size();i++){
            System.out.println(zaposleniNaPredstavi.get(i));
        }
    }

    @Override
    public String toString() {
        return nazivPredstave + "," + getNazivPozorista(); // +zaposleniNaPredstavi - stampa imena u jednom redu
    }
}
