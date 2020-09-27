package zadatak1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tablic {
    /*
    Zadatak predstavlja jedan deo kartaške igre ​Tablić​.
    - Napraviti metodu koja ce da u jedan niz ucita sve karte koje je jedan korisnik sakupio. Karte učitavati kao cele brojeve - ​
    kec ​je broj 11, žandar 12, dama 13 i kralj 14. Tražiti od korisnika da učita koliko karata ima, a nakon toga koje su to karte.
    Voditi računa o tome da li su broj karata, kao i svaka karta korektne vrednosti.

    - Napraviti metodu koja broji koliko ima štihova u nizu. Podrazumevati da ​mala dvojka​ i dupla desetka ​nemaju specijalno znacenje.

    - Napraviti metodu koja će za dva prosleđena niza vratiti informaciju o tome ko je pobednik (ko ima više sakupljenih štihova).

    - Napraviti glavni program koji prikazuje primenu svih prethodno napisanih metoda.
    */

    private int brojKarata;
    private int[] nizKarata;
    ArrayList<Integer> pocetnaLista = new ArrayList<>();

    public int spilUkupno() {
        return 52;
    }

    public void prviIgrac() {
        int[] pocetniNiz = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14};
        for (int i = 0; i < pocetniNiz.length; i++) {
            pocetnaLista.add(pocetniNiz[i]);
        }
        int n, unos;
        int brojac2 = 0, brojac3 = 0, brojac4 = 0, brojac5 = 0, brojac6 = 0, brojac7 = 0;
        int brojac8 = 0, brojac9 = 0, brojac10 = 0, brojac11 = 0, brojac12 = 0, brojac13 = 0, brojac14 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Koliko karata imate?");
        n = sc.nextInt();
        while (n < 0 || n > spilUkupno()) {
            System.out.println("Unesite broj od 0 do 52.");
            n = sc.nextInt();
        }
        if (n == 0) {
            System.out.println("Drugi igrac je pobenik.");
            System.exit(1);
        }
        if (n == 52) {
            System.out.println("Prvi igrac je pobednik.");
            System.exit(1);
        }

        int[] nizPrviIgrac = new int[n];
        this.brojKarata = n;
        for (int i = 0; i < nizPrviIgrac.length; i++) {
            System.out.println("Vasa " + (i + 1) + ". karta je: ");
            unos = sc.nextInt();
            while (unos < 2 || unos > 15) {
                System.out.println("Vrednost unete karte moze biti od 2 do 14.");
                unos = sc.nextInt();
            }
            nizPrviIgrac[i] = unos; // pravi niz sa elemntima unosa
            pocetnaLista.remove(Integer.valueOf(unos)); // izbacuje unete brojeve iz ArreyList pocetnaLista
        }
        // provera da li je uneta neka karta vise od 4 puta
        for (int i = 0; i < n; i++) {
            if (nizPrviIgrac[i] == 2) {
                brojac2++;
            }
            if (nizPrviIgrac[i] == 3) {
                brojac3++;
            }
            if (nizPrviIgrac[i] == 4) {
                brojac4++;
            }
            if (nizPrviIgrac[i] == 5) {
                brojac5++;
            }
            if (nizPrviIgrac[i] == 6) {
                brojac6++;
            }
            if (nizPrviIgrac[i] == 7) {
                brojac7++;
            }
            if (nizPrviIgrac[i] == 8) {
                brojac8++;
            }
            if (nizPrviIgrac[i] == 9) {
                brojac9++;
            }
            if (nizPrviIgrac[i] == 10) {
                brojac10++;
            }
            if (nizPrviIgrac[i] == 11) {
                brojac11++;
            }
            if (nizPrviIgrac[i] == 12) {
                brojac12++;
            }
            if (nizPrviIgrac[i] == 13) {
                brojac13++;
            }
            if (nizPrviIgrac[i] == 14) {
                brojac14++;
            }
        }
        if (brojac2 >= 5 || brojac3 >= 5 || brojac4 >= 5 || brojac5 >= 5 || brojac6 >= 5 || brojac7 >= 5 || brojac8 >= 5 || brojac9 >= 5 || brojac10 >= 5 || brojac11 >= 5 || brojac12 >= 5 || brojac13 >= 5 || brojac14 >= 6) {
            System.out.println("Pogresan unos!");
            System.out.println(Arrays.toString(nizPrviIgrac));
            System.exit(1);
        }
        System.out.println("Karte prvog igraca su:");
        System.out.println(Arrays.toString(nizPrviIgrac));
        this.nizKarata = nizPrviIgrac;
    }

    // stihovi su 10-ka, kec, zandar, dama i kralj
    public int brojanjeStihova(int[] niz) {
        int poeni = 0;
        //3 na karte
        if (niz.length > 26) {
            poeni = 3;
        }
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == 10 || niz[i] == 11 || niz[i] == 12 || niz[i] == 13 || niz[i] == 14) {
                poeni++;
            }
        }
        return poeni;
    }

    // metoda koja uporedjuje poene
    public void pobednik(int[] prvi, int[] drugi) {
        System.out.println("Prvi igrac je ostvario " + brojanjeStihova(prvi) + " poena.");
        System.out.println("Drugi igrac je ostvario " + brojanjeStihova(drugi) + " poena.");
        if (brojanjeStihova(prvi) > brojanjeStihova(drugi)) {
            System.out.println("Prvi igrac je pobenik.");
        } else if (brojanjeStihova(prvi) < brojanjeStihova(drugi)) {
            System.out.println("Drugi igrac je pobenik.");
        } else {
            System.out.println("Igraci imaju jednak broj poena.");
        }
    }

    public int getBrojKarata() {
        return brojKarata;
    }

    public int[] getNizKarata() {
        return nizKarata;
    }

    public ArrayList<Integer> getPocetnaLista() {
        return pocetnaLista;
    }
}