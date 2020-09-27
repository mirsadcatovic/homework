package zadatak1.tests;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import zadatak1.objects.Account;
import zadatak1.objects.AccountForm;
import zadatak1.objects.Catalog;
import zadatak1.objects.Home;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class RegistrationTest {
    /*Popuniti sva polja sa stranice https://petstore.octoperf.com/actions/Account.action?newAccountForm= i
    sacuvati informacije o nalogu.

    Proveriti da li je nalog uspesno sacuvan tako sto cete se ulogovati sa istim.
    */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("korisnici");
        Row row = sheet.createRow(0);

        wd.manage().window().maximize();
        wd.get(Home.url);
        Home.clickEnterTheStore(wd);
        Catalog.clickSignIn(wd);
        Account.clickRegisterNow(wd);

        AccountForm.setUserID(wd, "id1");
        Cell cell = row.createCell(0);
        cell.setCellValue("id1");

        AccountForm.setNewPassword(wd,"Sifra123");
        cell = row.createCell(1);
        cell.setCellValue("Sifra123");

        AccountForm.setRepetePassword(wd, "Sifra123");
        cell = row.createCell(2);
        cell.setCellValue("Sifra123");

        AccountForm.setFirstName(wd,"Pera");
        cell = row.createCell(3);
        cell.setCellValue("Pera");

        AccountForm.setLastName(wd, "Peric");
        cell = row.createCell(4);
        cell.setCellValue("Peric");

        AccountForm.setEmail(wd,"pera@gmail.com");
        cell = row.createCell(5);
        cell.setCellValue("pera@gmail.com");

        AccountForm.setPhone(wd, "060123456");
        cell = row.createCell(6);
        cell.setCellValue("060123456");

        AccountForm.setAddress1(wd,"Beogradska 1");
        cell = row.createCell(7);
        cell.setCellValue("Beogradska 1");

        AccountForm.setAddress2(wd, "Save Kovacevica 2");
        cell = row.createCell(8);
        cell.setCellValue("Save Kovacevica 2");

        AccountForm.setCity(wd,"Belgrade");
        cell = row.createCell(9);
        cell.setCellValue("Belgrade");

        AccountForm.setState(wd, "Serbia");
        cell = row.createCell(10);
        cell.setCellValue("Serbia");

        AccountForm.setZip(wd, "11000");
        cell = row.createCell(11);
        cell.setCellValue("11000");

        AccountForm.setCountry(wd, "Serbia");
        cell = row.createCell(12);
        cell.setCellValue("Serbia");

//        Select select = new Select(AccountForm.getLangPreference(wd));
//        select.selectByVisibleText("japanese");
        AccountForm.setLangPreference(wd,"japanese");
        cell = row.createCell(13);
        cell.setCellValue("japanese");

        AccountForm.setFavCategory(wd, "DOGS");
        cell = row.createCell(14);
        cell.setCellValue("DOGS");

        AccountForm.clickMyBanner(wd);
        cell = row.createCell(15);
        cell.setCellValue("enable");

        AccountForm.clickMyList(wd);
        cell = row.createCell(16);
        cell.setCellValue("enable");

        AccountForm.clickSaveAccount(wd);

        try {
            FileOutputStream fo = new FileOutputStream("pet_shop.xlsx");
            wb.write(fo);
            wb.close();
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        wd.close();
    }
}