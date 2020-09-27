package zadatak1.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import zadatak1.objects.Sortable;

public class SortiranjeDugmicaTest {

    public static void main(String[] args) {
        //Sortirati dugmice obrnutim redosledom sa stranice https://demoqa.com/sortable (iz opcije grid)

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();
        wd.get(Sortable.sortableURL);
        Sortable.clickGrid(wd);

        // pravi objekat "action" i pomera One na mesto Nine
        // mora da se zavrsi jedna akcija i onda sledeca akcija krece od stanja kakvo je ostavila prethodna akcija
        Actions action = new Actions(wd);
        action.clickAndHold(Sortable.getOne(wd)).moveToElement(Sortable.getNine(wd)).release();
        action.perform();

        //pomera Two na mesto Nine
        action.clickAndHold(Sortable.getTwo(wd)).moveToElement(Sortable.getNine(wd)).release();
        action.perform();

        //pomera Three na mesto Nine
        action.clickAndHold(Sortable.getThree(wd)).moveToElement(Sortable.getNine(wd)).release();
        action.perform();

        //pomera Four na mesto Nine
        action.clickAndHold(Sortable.getFour(wd)).moveToElement(Sortable.getNine(wd)).release();
        action.perform();

        //pomera Five na mesto Nine
        action.clickAndHold(Sortable.getFive(wd)).moveToElement(Sortable.getNine(wd)).release();
        action.perform();

        //pomera Six na mesto Nine
        action.clickAndHold(Sortable.getSix(wd)).moveToElement(Sortable.getNine(wd)).release();
        action.perform();

        //pomera Seven na mesto Nine
        action.clickAndHold(Sortable.getSeven(wd)).moveToElement(Sortable.getNine(wd)).release();
        action.perform();

        //pomera Eight na mesto Nine
        action.clickAndHold(Sortable.getEight(wd)).moveToElement(Sortable.getNine(wd)).release();
        action.perform();

        wd.close();
    }
}