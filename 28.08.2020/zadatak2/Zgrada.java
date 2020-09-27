package zadatak2;

import java.util.Scanner;

public class Zgrada {
    /*2. Napraviti sopstvenu klasu Zgrada.
Zgrada ima adresu na kojoj se nalazi, spratnost, broj stanova, prezimena stanara.
Sve tipove metoda u ovoj klasi treba iskoristiti u glavnom programu gde cete kreirati dve zgrade.
Sva polja mogu da se dohvate i postave.
*/
    private String adresa;
    private int spratnost;
    private int brStanova;
    private String[] prezimenaS;

    public Zgrada(String adresa, int spratnost, int brStanova) {
        this.adresa = adresa;
        this.spratnost = spratnost;
        this.brStanova = brStanova;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getSpratnost() {
        return spratnost;
    }

    public void setSpratnost(int spratnost) {
        this.spratnost = spratnost;
    }

    public int getBrStanova() {
        // this.prezimenaS = new String[brStanova]; mislio sam da ce staviti da je duzina niza jednaka broju stanova. samo mi je kreirao prazan niz
        return brStanova;
    }

    public void setBrStanova(int brStanova) {
        this.brStanova = brStanova;
    }

    public String[] getPrezimenaS() {
        return prezimenaS;
    }

    public void setPrezimenaS(String[] prezimenaS) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < brStanova; i++) {
            System.out.println("Unesite prezime vlasnika stana broj " + (i + 1));
            prezimenaS[i] = sc.next();
        }
        this.prezimenaS = prezimenaS;
    }
}
