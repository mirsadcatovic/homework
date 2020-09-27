import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException{
        /*Koristeci Selenium webdriver otici na sajt https://www.techlistic.com/p/selenium-practice-form.html i
        popuniti formu (idealno celu, ako ne ide onda probajte bar do kontinenta)
        Potrudite se da koristite vise nacina (lokatora) za pronalazenje elemenata.
        */

        System.setProperty("webdriver.chrome.driver","D:\\MIRSAD\\IT BootCamp QA\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();

        //First name
        WebElement txtFitstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        txtFitstName.sendKeys("Zika");

        //Last name
        WebElement txtLastName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[6]/input[1]"));
        txtLastName.sendKeys("Zikic");

        //Gender
        WebElement buttonSex = driver.findElement(By.cssSelector("#sex-0"));
        buttonSex.click();

        //Years of Experience
        WebElement buttonYearsOfExperience = driver.findElement(By.xpath("//input[@id='exp-6']"));
        buttonYearsOfExperience.click();

        //Date
        WebElement txtDate = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[18]/input[1]"));
        txtDate.sendKeys("15/09/2020");

        //Profession
        WebElement buttonManualTester = driver.findElement(By.cssSelector("#profession-0"));
        buttonManualTester.click();
        WebElement buttonAutomationTester = driver.findElement(By.cssSelector("#profession-1"));
        buttonAutomationTester.click();

        //Automation Tools
        WebElement buttonSeleniumWebdriver = driver.findElement(By.xpath("//input[@id='tool-2']"));
        buttonSeleniumWebdriver.click();

        //Continents
        WebElement Continents = driver.findElement(By.cssSelector("#continents"));
        Select selectContinent = new Select(Continents);
        selectContinent.selectByVisibleText("Europe");

        //Selenium Commands
        WebElement SeleniumCommands = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
        Select selectCommands = new Select(SeleniumCommands);
        selectCommands.selectByVisibleText("Navigation Commands");
        selectCommands.selectByIndex(4);
        selectCommands.deselectByIndex(4);// uklanja samo selektovanu opciju 4, a "Navigation Commands" ostaje selektovana

        //Upload Image
        WebElement buttonChooseFile = driver.findElement(By.cssSelector("#photo"));
        buttonChooseFile.sendKeys("C:\\Users\\mirsad\\Desktop\\download.jpg");

        //Download File
        WebElement buttonClickHere = driver.findElement(By.xpath("//a[contains(text(),'Click here to Download File')]"));
        buttonClickHere.click();
        Thread.sleep(2000);
        driver.navigate().back();

        //end of form
        WebElement buttonButton = driver.findElement(By.cssSelector("#submit"));
        buttonButton.click();

        Thread.sleep(7000);
        driver.close();
    }
}