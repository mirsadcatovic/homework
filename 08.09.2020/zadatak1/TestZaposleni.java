package zadatak1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Date;

public class TestZaposleni {
    /*Koristeci fajlove https://drive.google.com/drive/folders/1rCUwm3GwuBYEzdttYLHilmdxyWc-63DY potrebno je napraviti test
    za ispravnost klase Zaposleni.

    Ako se na osnovu testova pronađe neka greška u kodu potrebno je da se popravi originalni kod.
    Proveriti da li konstruktor public Zaposleni dobro postavlja argumente, kao i da li get metode
    vraćaju odgovarajuće vrednosti.
    */

    @Test
    public void metodaTest1() {
        Date d1 = new Date(2007, 3, 14);
        Zaposleni z1 = new Zaposleni("Petar Petrovic", 1983, d1);

        Date d2 = new Date(2015, 8, 22);
        String naziv = "Marko Markovic";
        int godRodjenja = 1990;
        Zaposleni z2 = new Zaposleni(naziv, godRodjenja, d2);
        z2.setNaziv("Luka Lukic");

        SoftAssert as = new SoftAssert();

        // provera konstruktora
        as.assertEquals(z1.getNaziv(), "Petar Petrovic");
        as.assertEquals(z1.getGodRodjenja(), 1983);
        as.assertEquals(z1.getDatumZap(), d1);

        // provera get metoda
        as.assertNotEquals(z1.getNaziv(), "Mika Mikic");
        as.assertNotEquals(z1.getGodRodjenja(), 1770);
        as.assertNotEquals(z1.getDatumZap(), d2);

        // provera set metode
        as.assertNotEquals(z2.getNaziv(), naziv);
        as.assertEquals(z2.getNaziv(), "Luka Lukic");

        as.assertEquals(z2.getGodRodjenja(), godRodjenja);
        as.assertEquals(z2.getDatumZap(), d2);

        as.assertAll();
    }
}