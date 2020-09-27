package zadatak1;

public class Automobil {
    /*
    Napisati klasu Automobil. Automobil ima
    marku (polje tipa String) koje moze da se dohvati, ali ne i postavi
    model (polje tipa String) koje moze da se dohvati ali ne i postavi
    serijski broj (polje tipa int) koje moze da se dohvati ali ne i postavi
    Automobil moze da ima vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku

    Napisati glavni program koji kreira dva automobila.
    U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

    NOVI DEO ZADATKA:
    1. Dopuniti zadatak Automobil sa predavanja tako sto se automobil kreira sa stepenom prenosa.
    Stepen prenosa moze da se smanji i poveca.
    */
    private String marka;
    private String model;
    private int serBr;
    private int stepenPrenosa; // izlazi iz fabrike  i sa ovim podatkom , moze da se menja, ali se ne dohvaca
    private String vlasnik;

    public Automobil(String marka, String model, int serBr, int stepenPrenosa) {
        this.marka = marka;
        this.model = model;
        this.serBr = serBr;
        this.stepenPrenosa = stepenPrenosa;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerBr() {
        return serBr;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int setStepenPrenos(int stepen) { // imamo samo setStepenPrenos, a nemamo getStepenPrenosa po tekstu zadatka
        if (stepen > 3 && stepen < 7) {
            stepenPrenosa = stepen;

        } else System.out.println("Stepen prenosa moze biti od 4 do 6");
        return stepenPrenosa;
    }
}
