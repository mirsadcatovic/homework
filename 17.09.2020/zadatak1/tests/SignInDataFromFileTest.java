package zadatak1.tests;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import zadatak1.objects.Account;
import zadatak1.objects.Catalog;
import zadatak1.objects.Home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class SignInDataFromFileTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();
        wd.get(Home.url);
        Home.clickEnterTheStore(wd);
        Catalog.clickSignIn(wd);

        FileInputStream fi;
        XSSFWorkbook wb;

        try {
            fi = new FileInputStream("pet_shop.xlsx");
            wb = new XSSFWorkbook(fi);

            Sheet sheet = wb.getSheet("korisnici");
            Row row = sheet.getRow((0));

            Cell cell = row.getCell(0);
            Account.setUserName(wd,cell.toString());

            for(int i =0; i<4; i++){
                Account.getPassword(wd).sendKeys(Keys.BACK_SPACE);
            }
            cell = row.getCell(1);
            Account.setPassword(wd,cell.toString());

            Account.clickLogIn(wd);

            Thread.sleep(3000);
            Catalog.clickSignOut(wd);

            Thread.sleep(3000);
            wd.close();
            wb.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fajl sa imenom pet_shop nije pronadjen.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}