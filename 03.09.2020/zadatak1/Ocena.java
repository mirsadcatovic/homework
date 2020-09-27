package zadatak1v2;

import java.util.Scanner;

public class Ocena {
    /*Napraviti klasu Ocena.
        Potrebno je da sadrzi broj poena koje je neko imao na ispitu i metodu koja vraca koja ocena je u pitanju.
        Sadrzi naziv predmeta, i rok u kom je odrzan.
        Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena koja racuna i vraca prosek.
      Prethodnu klasu testirati.
     */

    // ja bih pre ovu klasu nazvao Predmet, sa ovakim konstuktorom, a jos jednu klasu bi napravio i nazvao Ocena i tu bile metoda pretvaranja poena u ocenu i racunanje prosecne ocene
    private int brPoena;
    private String nazivPredmet;
    private String ispitniRok;
    public static int brojOcena = 0;

    public Ocena(String nazivPredmet, String ispitniRok) {
        this.nazivPredmet = nazivPredmet;
        this.ispitniRok = ispitniRok;
        brojOcena++;
    }

    public void setBrPoena() {
        int unos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj poena.");
        unos = sc.nextInt();
        while (unos < 0 || unos > 100) {
            System.out.println("Unesite pozitivan broj od 0 do 100.");
            unos = sc.nextInt();
        }
        this.brPoena = unos;
    }

    // poziva broj poena i pretvara u ocenu
    public int dobijenaOcena() {
        if (brPoena >= 0 && brPoena < 51) {
            return 5;
        }
        if (brPoena >= 51 && brPoena < 61) {
            return 6;
        }
        if (brPoena >= 61 && brPoena < 71) {
            return 7;
        }
        if (brPoena >= 71 && brPoena < 81) {
            return 8;
        }
        if (brPoena >= 81 && brPoena < 91) {
            return 9;
        } else return 10;
    }

    // racuna prosek iz niza sa ocenama
    public static double ProsekOcena(int[] niz) {
        int brojac=0;
        double suma = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == 5){ // menja ocenu 5 sa 0 i broji koliko ima brojeva 5
                niz[i]=0;
                brojac++;
            }
            suma += niz[i];
        }
        return suma / (niz.length-brojac); //deli sumu samo sa polozenim ispitima
    }

    public int getBrPoena() {
        return brPoena;
    }

    public String getNazivPredmet() {
        return nazivPredmet;
    }

    public String getIspitniRok() {
        return ispitniRok;
    }
}