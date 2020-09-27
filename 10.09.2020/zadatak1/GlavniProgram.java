package zadatak1;

public class GlavniProgram {
    public static void main(String[] args) {
        /*JA SAM POSMATRAO OVAJ ZADATAK KAO DA SE IGRALA IGRA SA DVA IGRACA I DA JE ZAVRSENA. SADA PREOSTAJE DA JEDAN IGRAC -->
        --> PREBROJI (UNESE) SVE KARTE KOJE JE "ODNEO" I REZULTAT ODIGRANE IGRE TREBA DA SE PRIKAZE.
        */

        Tablic t1 = new Tablic();

        // unose se karte od prvog igraca
        t1.prviIgrac();

        // karte za drugog igraca su dobijene na osnovu prvog igraca kao ostatak od ostalih karata
        System.out.println("Karte drugog igraca su:");
        System.out.println(t1.getPocetnaLista());

        // pretvata ArrayList drugog igraca u niz zbog uslova u zadatku
        //Napraviti metodu koja će za dva prosleđena niza vratiti informaciju o tome ko je pobednik (ko ima više sakupljenih štihova).
        int[] nizDrugiIgrac = new int[t1.getPocetnaLista().size()];
        for (int i = 0; i < t1.getPocetnaLista().size(); i++) {
            nizDrugiIgrac[i] = t1.getPocetnaLista().get(i);
        }

        // metoda pobednik iz klase Tablic
        // daje pobenika uporedjivanjem dva niza (prvi niz i drugi niz)
        t1.pobednik(t1.getNizKarata(), nizDrugiIgrac);
    }
}