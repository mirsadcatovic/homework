package zadatak1;

import java.util.Arrays;

public class GlavniProgram {
    public static void main(String[] args) {
        /*1. Napraviti sistem klasa koji opisuje knjigu.
        Autor poseduje ime, prezime, godinu rodjenja.
        Ime, prezime i godina rodjenja se zadaju prilikom kreiranja
        i ne mogu da se promene.

        Knjiga poseduje naziv, AUTORA (TIPA Autor),
        broj strana, godinu izdanja.
        Sva polja mogu da se dohvate,
        a godina izdanja moze i da se postavi

        U programu iskoristi sva polja iz svih kreiranih klasa gde ce se kreirati 3 knjige,
        a knjige biti poredjane po godini izdanja.
        */

        // Autori knjiga
        Autor a1 = new Autor("Petar", "Petrovic", 1964);
        Autor a2 = new Autor("Marko", "Markovic", 1937);
        System.out.println("Ime i prezime prvog autora je " + a1.getIme() + " " + a2.getPrezime());
        System.out.println("Drugi autor je rodjen " + a2.getGodRodjenja() + " godine.");

        // Knjige
        Knjiga k1 = new Knjiga("Knjiga 1", 100, 1987, a1);
        Knjiga k2 = new Knjiga("Knjiga 2", 765, 2004, a1);
        Knjiga k3 = new Knjiga("Knjiga 3", 85, 1965, a2);
        System.out.println("Prvu knjigu koju je napisao " + a1.getIme() + " " + a1.getPrezime() + " jeste " + k1.getNaziv());
        System.out.println("Ima " + k1.getBrStrana() + " stranica i izadate je " + k1.getGodIzdavanja() + " godine.");
        System.out.println("Njegova druga knjiga izdata je pod imenom " + k2.getNaziv() + ".");
        System.out.println(k3.getA());
        k3.setGodIzdavanja(1999);
        System.out.println(k3.getNaziv() + " dozivela je reizdanje u godini " + k3.getGodIzdavanja() + ".");


        // Sortiranje preko niza
        int[] sveKnjige = {k1.getGodIzdavanja(), k2.getGodIzdavanja(), k3.getGodIzdavanja()};
        System.out.println("Pre sortiranja : " + Arrays.toString(sveKnjige));

        for (int i = 0; i < sveKnjige.length - 1; i++) {
            for (int j = 1; j < sveKnjige.length; j++) {
                if (sveKnjige[i] > sveKnjige[j]) {
                    int temp = sveKnjige[i];
                    sveKnjige[i] = sveKnjige[j];
                    sveKnjige[j] = temp;
                }
            }
        }
        System.out.println("Posle sortiranja : " + Arrays.toString(sveKnjige));
        System.out.println("Prva knjiga je izdata " + sveKnjige[0] + " godine.");
        System.out.println("Druga knjiga je izdata " + sveKnjige[1] + " godine.");
        System.out.println("Treca knjiga je izdata " + sveKnjige[2] + " godine.");


        // Sortiranje preko if-a
        if (k1.getGodIzdavanja() > k2.getGodIzdavanja() && k1.getGodIzdavanja() < k3.getGodIzdavanja()) {
            System.out.println("Prvo je izdata knjiga " + k2.getNaziv() + " i to " + k2.getGodIzdavanja() + " godine.");
            System.out.println("Druga izdata knjiga " + k1.getNaziv() + " i to " + k1.getGodIzdavanja() + " godine.");
            System.out.println("Treca izdata knjiga " + k3.getNaziv() + " i to " + k3.getGodIzdavanja() + " godine.");
        }
        if (k2.getGodIzdavanja() > k1.getGodIzdavanja() && k2.getGodIzdavanja() < k3.getGodIzdavanja()) {
            System.out.println("Prvo je izdata knjiga " + k1.getNaziv() + " i to " + k1.getGodIzdavanja() + " godine.");
            System.out.println("Druga izdata knjiga " + k2.getNaziv() + " i to " + k2.getGodIzdavanja() + " godine.");
            System.out.println("Treca izdata knjiga " + k3.getNaziv() + " i to " + k3.getGodIzdavanja() + " godine.");
        }
        if (k3.getGodIzdavanja() > k1.getGodIzdavanja() && k3.getGodIzdavanja() < k2.getGodIzdavanja()) {
            System.out.println("Prvo je izdata knjiga " + k1.getNaziv() + " i to " + k1.getGodIzdavanja() + " godine.");
            System.out.println("Druga izdata knjiga " + k3.getNaziv() + " i to " + k3.getGodIzdavanja() + " godine.");
            System.out.println("Treca izdata knjiga " + k2.getNaziv() + " i to " + k2.getGodIzdavanja() + " godine.");
        }
        
        if (k1.getGodIzdavanja() < k2.getGodIzdavanja() && k1.getGodIzdavanja() > k3.getGodIzdavanja()) {
            System.out.println("Prvo je izdata knjiga " + k3.getNaziv() + " i to " + k3.getGodIzdavanja() + " godine.");
            System.out.println("Druga izdata knjiga " + k1.getNaziv() + " i to " + k1.getGodIzdavanja() + " godine.");
            System.out.println("Treca izdata knjiga " + k2.getNaziv() + " i to " + k2.getGodIzdavanja() + " godine.");
        }
        if (k2.getGodIzdavanja() < k1.getGodIzdavanja() && k2.getGodIzdavanja() > k3.getGodIzdavanja()) {
            System.out.println("Prvo je izdata knjiga " + k3.getNaziv() + " i to " + k3.getGodIzdavanja() + " godine.");
            System.out.println("Druga izdata knjiga " + k2.getNaziv() + " i to " + k2.getGodIzdavanja() + " godine.");
            System.out.println("Treca izdata knjiga " + k1.getNaziv() + " i to " + k1.getGodIzdavanja() + " godine.");
        }
        if (k3.getGodIzdavanja() < k1.getGodIzdavanja() && k3.getGodIzdavanja() > k2.getGodIzdavanja()) {
            System.out.println("Prvo je izdata knjiga " + k2.getNaziv() + " i to " + k2.getGodIzdavanja() + " godine.");
            System.out.println("Druga izdata knjiga " + k3.getNaziv() + " i to " + k3.getGodIzdavanja() + " godine.");
            System.out.println("Treca izdata knjiga " + k1.getNaziv() + " i to " + k1.getGodIzdavanja() + " godine.");
        }
    }
}