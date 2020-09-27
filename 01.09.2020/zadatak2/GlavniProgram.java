package zadatak2;

public class GlavniProgram {
    public static void main(String[] args) {
/*
        # Osoba
        Osoba poseduje naziv, jmbg, godinu rodjenja. Naziv, jmbg i godina rodjenja se zadaju prilikom kreiranja.
        Naziv moze da se dohvati i postavi. JMBG i godina rodjenja mogu samo da se dohvate.

        # Zaposleni
        Zaposleni je `Osoba` koja poseduje i stepen strucne spreme
        Stepen strucne spreme moze da se dohvati i postavi

        # Pacijent
        Pacijent je `Osoba` koja poseduje broj knjizice (LIB). Broj knjizice se zadaje prilikom kreiranja i moze da se dohvati i postavi

        # Doktor
        Doktor je `Zaposleni` koji ima naziv fakulteta. Naziv fakulteta se zadaje prilikom kreiranja i moze da se dohvati i postavi

        # Tehnicar
        Tehnicar je `Zaposleni` koji ima referencu na doktora za kojeg radi. Referenca na doktora za ojeg radi moze da se dohvati i postavi


        2. Dopuniti deo zadataka koji smo radili na predavanju a Dusan zadao da se uradi za domaci.
         */

        // osoba
        Osoba o1 = new Osoba("Petar Petrovic", "010199774681", 1997); // JMBG je 12, a treba 13 cifara i zato je null
        System.out.println(o1);

        // zaposleni
        Zaposleni zap1 = new Zaposleni("Mika Mikic", "0101997746812", 1998);
        zap1.setStepenStrucneSpreme(7.1);
        System.out.println(zap1);

        // pacijent
        Pacijent pac1 = new Pacijent("Luka LUkic", "0101997746812", 1999, "1234567891"); //LIB je 10, a treba 11 cifara i zato je null
        System.out.println(pac1); // ispis null za LIB
        pac1.setBrojKnjizice("12345678911");
        System.out.println(pac1); // dobar ispis

        // doktor
        Doktor dok1 = new Doktor("Srki Srkic", "0101997746812", 1981, "Medicinski Fakultet");
        dok1.setStepenStrucneSpreme(8);
        System.out.println(dok1);

        // tehnicar
        Tehnicar teh1 = new Tehnicar("Marko Markovic", "0101997746812", 2001);
        teh1.setRefDoktora(dok1);
        System.out.println("Tehnicar " + teh1.getNaziv() + " ima za referencu doktora " + teh1.getRefDoktora());
        teh1.setStepenStrucneSpreme(4);
        System.out.println(teh1);
        System.out.println(teh1.getRefDoktora());

        Tehnicar teh2 = new Tehnicar("Nenad Nedic", "0101997746812", 1995);
        System.out.println("Tehnicar 2 i njegova referenca za doktora " + teh2.getRefDoktora()); // null, zato sto nismo uneli njegovu referencu za doktora
    }
}