package zadatak2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest {
    private Bank mobi;

    @BeforeClass
    public void kreiranjeBanke() {
        mobi = new Bank();
    }

    @BeforeMethod
    public void resetBanke() {
        mobi.reset();
    }

    //Potrebno je ispitati da li adekvatno radi otvaranje naloga,
    // tako što će se ubaciti 5 naloga i zatim ispitati da li se ti nalozi mogu dohvatiti.
    @Test
    public void otvaranjeNaloga(){
        Account ivana = mobi.openAccount("Ivana");
        Account pera = mobi.openAccount("Pera");
        Account mika = mobi.openAccount("Mika");
        Account zika = mobi.openAccount("Zika");
        Account dika = mobi.openAccount("Dika");

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(mobi.getAccount(ivana.getNumber()), ivana);
        sa.assertEquals(mobi.getAccount(pera.getNumber()), pera);
        sa.assertEquals(mobi.getAccount(mika.getNumber()), mika);
        sa.assertEquals(mobi.getAccount(zika.getNumber()), zika);
        sa.assertEquals(mobi.getAccount(dika.getNumber()), dika);

        sa.assertAll();
    }

    @Test
    public void proveraUplate() {
        Account ivana = mobi.openAccount("Ivana");

        mobi.payInMoney(ivana.getNumber(), 38000.0);
        //ocekujemo da nakon ovoga ivana ima 38000

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(ivana.getAmount(), 38000.0);

        sa.assertAll();
    }

    @Test
    public void proveraTransfera() {
        //Bank mobi = new Bank();
        Account ivana = mobi.openAccount("Ivana");
        Account pera = mobi.openAccount("Pera");

        mobi.payInMoney(ivana.getNumber(), 5000.0);
        mobi.transferMoney(ivana.getNumber(), pera.getNumber(), 2000.0);
        //ocekujemo da nakon ovoga ivana ima 3000, a pera 2000

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(ivana.getAmount(), 3000.0);
        sa.assertEquals(pera.getAmount(), 2000.0);

        sa.assertAll();
    }

    @Test
    public void sumaMetodaSoft() {
        Account ivana = mobi.openAccount("Ivana");
        Account pera = mobi.openAccount("Pera");
        mobi.payInMoney(ivana.getNumber(), 5000.0);
        mobi.payInMoney(pera.getNumber(), 6000.0);

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(mobi.getSumMoney(), 11000.0);

        sa.assertAll();
    }

    @Test
    public void sumaMetodaHard() {
        Account ivana = mobi.openAccount("Ivana");
        Account pera = mobi.openAccount("Pera");
        mobi.payInMoney(ivana.getNumber(), 5000.0);
        mobi.payInMoney(pera.getNumber(), 6000.0);

        Double ocekivani = 11000.0;
        Double stvarni = mobi.getSumMoney();
        Assert.assertEquals(ocekivani,stvarni);
    }
}
