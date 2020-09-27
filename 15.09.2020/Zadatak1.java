import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadatak1 {
    public static void main(String[] args) {
        /*Koristeci svoju tabelu sa potrebnim vrednostima, automatizovati kupovinu na sajtu https://www.saucedemo.com.
        Proci kroz sledece stavke:
        a) Ulogovati se sa ispravnim kredencijalima(na sajtu su ispisani ispravni kredencijali, probati sa 2 username-a)
        b) Izabrati da redosled proizvoda bude od najjeftinijeg do najskupljeg
        c) Dodati najskuplji proizvod u cart
        d) Preci na korak za placanje i popuniti neophodna polja
        e) Uspesno zavrsiti kupovinu

        Dodatno: Izvuci informaciju (mozete i rucno) o iznosu takse na kupovinu, nazivu proizvoda i
        payment information (#nekbrojevi) te iste informacije ubaciti u tabelu a zatim prilikom dolaska
        na tu stranicu kroz test, proveriti da li se ta dva parametra poklapaju sa onim sto imate u vasoj tabeli.
        */

        System.setProperty("webdriver.chrome.driver","D:\\MIRSAD\\IT BootCamp QA\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        XSSFWorkbook wb;
        FileInputStream fi;

        try {
            fi = new FileInputStream("C:\\Users\\mirsad\\Desktop\\Book1.xlsx");
            wb = new XSSFWorkbook(fi);

            Sheet sheet = wb.getSheetAt(1);

            for (int i = 0; i < (sheet.getLastRowNum()+1); i++) {

                Row row = sheet.getRow((i));
                Cell cell = row.getCell(3);
                WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
                userName.sendKeys((cell.toString()));

                cell = row.getCell(4);
                WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
                password.sendKeys((cell.toString()));

                WebElement buttonLogin = driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[3]"));
                buttonLogin.click();

                WebElement sortProduct = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
                Select selectContinent = new Select(sortProduct);
                selectContinent.selectByVisibleText("Price (low to high)");

                WebElement buttonAddToCard = driver.findElement(By.xpath("//div[6]//div[3]//button[1]"));
                buttonAddToCard.click();

                WebElement buttonCart = driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]"));
                buttonCart.click();

                WebElement buttonCheckout = driver.findElement(By.cssSelector("body.main-body:nth-child(2) div.page_wrapper:nth-child(1) div:nth-child(2) div.cart_contents_container div:nth-child(1) div.cart_footer > a.btn_action.checkout_button"));
                buttonCheckout.click();

                cell = row.getCell(0);
                WebElement txtFirsName = driver.findElement(By.xpath("//input[@id='first-name']"));
                txtFirsName.sendKeys(cell.toString());

                cell = row.getCell(1);
                WebElement txtLastName = driver.findElement(By.xpath("//input[@id='last-name']"));
                txtLastName.sendKeys(cell.toString());

                cell = row.getCell(2);
                WebElement txtPostlCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
                txtPostlCode.sendKeys(cell.toString());

                WebElement buttonContinue = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
                buttonContinue.click();

                cell = row.getCell(5);
                WebElement productName = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
                if(!(cell.toString()).equals("Sauce Labs Fleece Jacket")){
                    System.out.println("Izabrali ste pogresan proizvod. Najskuplji proizvod je: Sauce Labs Fleece Jacket");
                    System.exit(2);
                }

                cell = row.getCell(6);
                WebElement productCode = driver.findElement(By.xpath("//div[contains(text(),'SauceCard #31337')]"));
                if(!(cell.toString()).equals("SauceCard #31337")){
                    System.out.println("Izabrali ste pogresan proizvod. Najskuplji proizvod ima kod: SauceCard #31337");
                    System.exit(2);
                }

                cell = row.getCell(7);
                WebElement productTax = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[6]"));
                if(!(cell.toString()).equals("Tax: $4.00")){
                    System.out.println("Izabrali ste pogresan proizvod. Porez za najskuplji proizvod iznosi: Tax: $4.00");
                    System.exit(2);
                }

                WebElement buttonFinish = driver.findElement(By.xpath("//a[@class='btn_action cart_button']"));
                buttonFinish.click();

                WebElement buttonMenu = driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]"));
                buttonMenu.click();

                Thread.sleep(500);

                WebElement buttonLogOut = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
                buttonLogOut.click();

                Thread.sleep(500);
            }
            driver.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fajl sa imenom Book1 nije pronadjen.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}