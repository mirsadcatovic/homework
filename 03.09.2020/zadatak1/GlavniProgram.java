package zadatak1;

import java.util.Arrays;

public class GlavniProgram {
    public static void main(String[] args) {
        /*Napraviti klasu Ocena.
            Potrebno je da sadrzi broj poena koje je neko imao na ispitu i metodu koja vraca koja ocena je u pitanju.
            Sadrzi naziv predmeta, i rok u kom je odrzan.
            Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena koja racuna i vraca prosek.
        Prethodnu klasu testirati.
         */

        Ocena o1 = new Ocena("Matematika", "jul");
        Ocena o2 = new Ocena("Fizika", "septembar");
        Ocena o3 = new Ocena("Statistika", "januar");

        System.out.println("Predmet: "+o1.getNazivPredmet());
        o1.setBrPoena();
        System.out.println("Uneti broj poena je " + o1.getBrPoena());
        System.out.println("U ispitnom roku " + o1.getIspitniRok() + " dobijena ocena je " + o1.dobijenaOcena() + " .");

        System.out.println("Predmet: "+o2.getNazivPredmet());
        o2.setBrPoena();
        System.out.println("Uneti broj poena je " + o2.getBrPoena());
        System.out.println("U ispitnom roku " + o2.getIspitniRok() + " dobijena ocena je " + o2.dobijenaOcena() + " .");

        System.out.println("Predmet: "+o3.getNazivPredmet());
        o3.setBrPoena();
        System.out.println("Uneti broj poena je " + o3.getBrPoena());
        System.out.println("U ispitnom roku " + o3.getIspitniRok() + " dobijena ocena je " + o3.dobijenaOcena() + " .");

        System.out.println("Ukupno kreirano objekata Ocena je " + Ocena.brojOcena);
        int[] niz = {o1.dobijenaOcena(), o2.dobijenaOcena(), o3.dobijenaOcena()};
        System.out.println("Ostvarene ocene na ispitima su: "+Arrays.toString(niz));

        // u sumu zbira ocena sam stavio da mi ne uracunava ispite koji su se pali
        // tu sumu mi deli sa brojem samo ispita koji su polozeni, ne uzima u obzir ispite sa brojem 5
        System.out.println("Prosecna ocena je: " + Ocena.ProsekOcena(niz));
    }
}