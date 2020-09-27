package zadatak1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        /*
            Napraviti sistem klasa koji opisuje jednu firmu:

            # Zaposleni [P]
            Zaposleni ima naziv( string - ime i prezime ), godinu rodjenja i datum kada se zaposlio.
            Naziv se zadaje prilikom kreiranaj i mogucega je dohvatiti i naknadno postaviti.
            Godina rodjenja se zadaje prilikom kreiranja i moguce je samo dohvatiti.
            Datum kada se zaposlio se zadaje prilikom kreiranja i moguce ga je samo dohvatiti.

            # Menadzer [P]
            Menadzer je `Zaposleni` koji ima naziv odeljenja koje vodi. naziv moze da se dohvati i postavi

            # Magacioner [V]
            Magacioner je `Zaposleni` koji ima naziv magacina u kome radi.  naziv magacina moze da se dohvati i postavi
         */

        // datum primer 1
        Date d1 = new Date(20/9/20);
        Zaposleni z1 = new Zaposleni("Petar Petrovic", 1983, d1);
        System.out.println(z1.getDatumZap());

        // datum primer 2
        Date d2 = new Date(2000, 4,21);
        Zaposleni z2 = new Zaposleni("Marko Markovic", 1990, d2);
        System.out.println(z2.getDatumZap());

        // datum primer 3
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date d3 = df.parse("14/07/2001");
        Zaposleni z3 = new Zaposleni("Luka Lukic", 1970, d3);
        System.out.println(z3.getDatumZap());



        Date d4= new Date();
        Menadzer men1= new Menadzer("Pera Peric",1997,d4);
        System.out.println(men1.getNaziv());
        Magacioner mag1 = new Magacioner("Jovan Jovanovic",1900,d4);
        mag1.setNazivMagacina("Beorol");
        System.out.println(mag1.getNazivMagacina());
    }
}
