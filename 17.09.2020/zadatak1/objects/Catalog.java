package zadatak1.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Catalog {
    private static String signInXpath = "//a[contains(text(),'Sign In')]";
    private static String signOutXpath ="//a[contains(text(),'Sign Out')]";

    public static WebElement getSignIn(WebDriver wd) {
        return wd.findElement(By.xpath(signInXpath));
    }

    public static void clickSignIn(WebDriver wd) {
        getSignIn(wd).click();
    }

    public static WebElement getSignOut(WebDriver wd) {
        return wd.findElement(By.xpath(signOutXpath));
    }

    public static void clickSignOut(WebDriver wd) {
        getSignOut(wd).click();
    }
}
