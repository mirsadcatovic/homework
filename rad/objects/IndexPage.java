package rad.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IndexPage {
    public static String indexPageURL = "http://automationpractice.com/index.php";
    public static String womenXpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
    public static String womenSummerDressesXpath = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
    public static String dressesXpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
    public static String dressesSummerDressesXpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/ul[@class='submenu-container clearfix first-in-line-xs']/li[3]/a[1]";

    public static WebElement getWomen(WebDriver wd) {
        return wd.findElement(By.xpath(womenXpath));
    }

    public static void moveToWomen(WebDriver wd) {
        Actions action = new Actions(wd);
        action.moveToElement(getWomen(wd)).perform();
    }

    public static WebElement getWomenSummerDresses(WebDriver wd) {
        return wd.findElement(By.xpath(womenSummerDressesXpath));
    }

    public static void clickWomenSummerDresses(WebDriver wd) {
        getWomenSummerDresses(wd).click();
    }

    public static WebElement getDresses(WebDriver wd) {
        return wd.findElement(By.xpath(dressesXpath));
    }

    public static void moveToDresses(WebDriver wd) {
        Actions action = new Actions(wd);
        action.moveToElement(getDresses(wd)).perform();
    }

    public static WebElement getDressesSummerDresses(WebDriver wd) {
        return wd.findElement(By.xpath(dressesSummerDressesXpath));
    }

    public static void clickDressesSummerDresses(WebDriver wd) {
        getDressesSummerDresses(wd).click();
    }
}
