package zadatak1.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
    public static String url = "https://petstore.octoperf.com/";
    private static String enterTheStoreXpath = "//a[contains(text(),'Enter the Store')]";

    public static WebElement getEnterTheStoreElem( WebDriver wd) {
        return wd.findElement(By.xpath(enterTheStoreXpath));
    }

    public static void clickEnterTheStore(WebDriver wd) {
        getEnterTheStoreElem(wd).click();
    }
}
