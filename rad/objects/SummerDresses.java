package rad.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SummerDresses {
    public static String summerDressesURL = "http://automationpractice.com/index.php?id_category=11&controller=category";
    public static String womenSummerDressesURL = "http://automationpractice.com/index.php?id_category=11&controller=category";
    public static String dressesSummerDressesURL = "http://automationpractice.com/index.php?id_category=11&controller=category";
    public static String secondSummerDressXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]";
    public static String quantityPlusSecondSummerDressXpath = "//i[@class='icon-plus']";
    public static String sizeSecondSummerDressCssSelector = "#group_1";
    public static String sizeM = "M";
    public static String colorWhiteSecondSummerDressCssSelector = "#color_8";
    public static String addToCartXpath = "//span[contains(text(),'Add to cart')]";
    public static String proceedToCheckoutXpath = "//span[contains(text(),'Proceed to checkout')]";
    public static String dressNameXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/h1[1]";
    public static String dressModelXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/p[1]/span[1]";

    public static WebElement getSecondSummerDress(WebDriver wd) {
        return wd.findElement(By.xpath(secondSummerDressXpath));
    }

    public static void clickSecondSummerDress(WebDriver wd) {
        getSecondSummerDress(wd).click();
    }

    public static WebElement getPlusQuantitySecondSummerDress(WebDriver wd) {
        return wd.findElement(By.xpath(quantityPlusSecondSummerDressXpath));
    }

    public static void clickPlusQuantitySecondSummerDress(WebDriver wd) {
        getPlusQuantitySecondSummerDress(wd).click();
    }

    public static WebElement getSizeSecondSummerDress(WebDriver wd) {
        return wd.findElement(By.cssSelector(sizeSecondSummerDressCssSelector));
    }

    public static void setSizeSecondSummerDress(WebDriver wd) {
        Select select = new Select(getSizeSecondSummerDress(wd));
        select.selectByVisibleText(sizeM);
    }

    public static WebElement getWhiteColorSecondSummerDress(WebDriver wd) {
        return wd.findElement(By.cssSelector(colorWhiteSecondSummerDressCssSelector));
    }

    public static void clickWhiteColorSecondSummerDress(WebDriver wd) {
        getWhiteColorSecondSummerDress(wd).click();
    }

    public static WebElement getAddToCard(WebDriver wd) {
        return wd.findElement(By.xpath(addToCartXpath));
    }

    public static void clickAddToCard(WebDriver wd) {
        getAddToCard(wd).click();
    }

    public static WebElement getProceedToCheckout(WebDriver wd) {
        return wd.findElement(By.xpath(proceedToCheckoutXpath));
    }

    public static void clickProceedToCheckout(WebDriver wd) {
        getProceedToCheckout(wd).click();
    }

    public static String getDressName(WebDriver wd) {
        return wd.findElement(By.xpath(dressNameXpath)).getText();
    }

    public static String getDressModel(WebDriver wd) {
        return wd.findElement(By.xpath(dressModelXpath)).getText();
    }
}