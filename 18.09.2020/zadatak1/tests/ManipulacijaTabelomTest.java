package zadatak1.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import zadatak1.objects.Webtables;

public class ManipulacijaTabelomTest {

    public static void main(String[] args) {
        /*Na stranici https://demoqa.com/webtables :
        - obrisati 2 od 3 postojeca reda
        - preostali red u tabeli editovati sa random parametrima
        - napraviti jedan novi red sa svojim random parametrima
        */
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get(Webtables.webtableURL);

        // brise red 1 i red 2 iz tabele
        Webtables.clickDeleteRow1(wd);
        Webtables.clickDeleteRow2(wd);

        // edituje red 3 iz ponudjene tabele
        Webtables.clickEditRow3(wd);
        for (int i = 0; i < 6; i++) {
            Webtables.getLastName(wd).sendKeys(Keys.BACK_SPACE);
        }
        Webtables.setLastName(wd, Webtables.changeLastName);
        Webtables.clickSubmit(wd);

        // pravljenje novog reda
        Webtables.clickAdd(wd);
        Webtables.setFirstName(wd, Webtables.newPersonFirstName);
        Webtables.setLastName(wd, Webtables.newPersonLastName);
        Webtables.setEmail(wd, Webtables.newPersonEmail);
        Webtables.setAge(wd, Webtables.newPersonAge);
        Webtables.setSalery(wd, Webtables.newPersonSalary);
        Webtables.setDepartment(wd, Webtables.newPersonDepartment);
        Webtables.clickSubmit(wd);

        wd.close();
    }
}