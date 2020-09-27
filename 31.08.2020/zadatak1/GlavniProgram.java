package zadatak1;

public class GlavniProgram {
    public static void main(String[] args) {
        /*Kreirati sopstvenu klasu Studenti, koja ce imati sledece podatke:
        njihova imena i prezimena, broj indexa, smer, rezultate ispita izrazeni u procentima ( 51% za polozen ispit).

        U svoj programu koristii klasu i sve navedene parametre gde ce korisnik programa unositi parametre
        broj indexa i rezultati ispita. Unos samo broja indexa ispita treba da izbaci sve podatke o studentu.
        */

        Studenti s1= new Studenti("Pera Peric","drumski","DR-123");
        Studenti s2 =  new Studenti("Laza Lazic", "logistika","LO-267");
        Studenti s3 = new Studenti("Marko Markovic", "vodni", "VO-745");

        // menja broj indeksa
        s2.setBrIndeksa("LO-473");

        // stampa sve podatke o studentu - kada nisu uneti rezultati ispita
        System.out.println(s1.getBrIndeksa());
        System.out.println(s2.getBrIndeksa());
        System.out.println(s3.getBrIndeksa());

        //unos rezultata, stampanje rezultata i poruka da li je polozio ispit ili nije na osnovu rezultata
        s1.setRezultat(81);
        System.out.println("Sacuvana vrednost za rezultat je "+s1.getRezultat()); //81
        s2.setRezultat(50);
        System.out.println("Sacuvana vrednost za rezultat je "+s2.getRezultat()); //50
        s3.setRezultat(-4);
        System.out.println("Sacuvana vrednost za rezultat je "+s3.getRezultat()); //0, ne prihvata -4

        // stampa sve podatke o studentu - kada su uneti rezultati ispita
        System.out.println(s1.getBrIndeksa());
        System.out.println(s2.getBrIndeksa());
        System.out.println(s3.getBrIndeksa());
    }
}
