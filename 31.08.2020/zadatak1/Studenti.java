package zadatak1;

public class Studenti {
    /*Kreirati sopstvenu klasu Studenti, koja ce imati sledece podatke:
      njihova imena i prezimena, broj indexa, smer, rezultate ispita izrazeni u procentima ( 51% za polozen ispit).

      U svoj programu koristii klasu i sve navedene parametre gde ce korisnik programa unositi parametre
      broj indexa i rezultati ispita. Unos samo broja indexa ispita treba da izbaci sve podatke o studentu.
    */

    private String imeIPrezime;
    private String smer;
    private String brIndeksa;
    private int rezultat;

    public Studenti(String imeIPrezime, String smer, String brIndeksa) {
        this.imeIPrezime = imeIPrezime;
        this.smer = smer;
        this.brIndeksa = brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getBrIndeksa() {
        return "Ime i prezime: " + imeIPrezime + ", smer: " + smer + ", broj indeksa: " + brIndeksa + ", broj poena na ispitu: " +rezultat;
    }

    public void setRezultat(int rezultat) {
        if (rezultat < 0 || rezultat > 100) {
            System.out.println("Pogresan unos!");
            return;
        } else if (rezultat >= 51) {
            System.out.println("Student je polozio ispit");
        } else {
            System.out.println("Student nije polozio ispit");
        }
        this.rezultat = rezultat;
    }

    public int getRezultat() {
        return rezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getSmer() {
        return smer;
    }
}
