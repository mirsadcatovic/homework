package zadatak2;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.UUID;

public class AccountTest {

    /*Potrebno je napraviti test za ispravnost klase Account.
    Ako se na osnovu testova pronađe neka greška u kodu potrebno je da se popravi originalnin kod.

a)Proveriti da li konstruktor public Account(String name, String number) dobro postavlja argumente,
kao i da li get metode vraćaju odgovarajuće vrednosti. Kada se napravi račun, stanje treba da bude jednako 0.
    */

    @Test
    public void metodaTest1() {
        Account ac1 = new Account("Petar", "1234");

        String ime = "Marko";
        String broj = "1235";
        Account ac2 = new Account(ime, broj);

        SoftAssert as = new SoftAssert();

        as.assertEquals(ac1.getName(), "Petar");
        as.assertEquals(ac1.getNumber(), "1234");
        as.assertEquals(ac1.getAmount(), 0.0);

        as.assertEquals(ac2.getName(), ime);
        as.assertEquals(ac2.getNumber(), broj);
        as.assertEquals(ac2.getAmount(), 0.0);

        as.assertAll();
    }

    //Proveriti da li set metode dobro postavljaju odgovarajuće vrednosti,
    // kao i da li get metode vraćaju odgovarajuće vrednosti.

    @Test
    public void metodaTest2() {
        Account ac1 = new Account("Petar", "1234");
        ac1.setAmount(500.0);

        SoftAssert as = new SoftAssert();
        as.assertEquals(ac1.getAmount(), 500.0);

        as.assertEquals(ac1.getNumber(), "1234");
        as.assertEquals(ac1.getName(), "Petar");
        as.assertEquals(ac1.getAmount(), 500.0);

        as.assertAll();
    }
    /*Proveriti da li je ispravan format ispisa jednog Account-a.
    Očekivani format ispisa: broj<tab>ime<tab>stanje. Stanje treba da bude zaokruženo na dve decimale.
    */

    @Test
    public void proveraIspisa() {
        Account ac1 = new Account("Petar", "1234");
        Account ac2 = new Account("Marko");

        Bank b = new Bank();
        Account ac3 = b.openAccount("Srdjan");

        SoftAssert as = new SoftAssert();

        //broj<tab>ime<tab>stanje
        String ispis = String.format("%s\t%s\t%.2f", ac1.getNumber(), ac1.getName(), 0.00);
        //as.assertEquals(ac1.toString(), String.format("%s\t%s\t%.2f", ac1.getNumber(), ac1.getName(), 0.00));
        as.assertEquals(ac1.toString(), ispis);
//        as.assertEquals(b.getAccount(ac1.getNumber()),ac1.getAmount());
//
//        as.assertEquals(ac3.getName(),"Srdjan");
//        as.assertEquals(b.getAccount(ac3.getNumber()),ac3.getNumber());

        as.assertAll();
    }

    @Test
    public void otvaranjeNaloga() {
        //ArrayList<Account> listaRacuna = new ArrayList<>();
        int max = 50;
        Account[] racuni = new Account[max];
        for (int i = 0; i < racuni.length; i++) {
            racuni[i] = new Account("Pera",UUID.randomUUID().toString());
            //listaRacuna.add(new Account("Pera"+i,UUID.randomUUID().toString()));
        }

        SoftAssert as = new SoftAssert();

        for(int i =0; i<racuni.length-1;i++){
            for(int j = i+1;j<racuni.length;j++){
                as.assertNotEquals(racuni[i].getNumber(),racuni[j].getNumber());
            }
        }

    }


}
