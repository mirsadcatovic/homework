package rad.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BottomMenu {
    public static String facebookAccXpath = "//li[@class='facebook']//a";
    public static String facebookAccURL = "https://www.facebook.com/groups/525066904174158/";
    public static String twitterAccXpath = "//li[@class='twitter']//a";
    public static String twitterAccURL = "https://twitter.com/seleniumfrmwrk";
    public static String youTubeAccXpath = "//li[@class='youtube']//a";
    public static String youTubeAccURL = "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA";
    public static String googlePlusAccXpath = "//li[@class='google-plus']//a";
    public static String googlePlusAccURL = "https://plus.google.com/111979135243110831526/posts";

    public static WebElement getFacebookAcc(WebDriver wd) {
        return wd.findElement(By.xpath(facebookAccXpath));
    }

    public static void clickFacebookAcc(WebDriver wd) {
        getFacebookAcc(wd).click();
    }

    public static WebElement getTwitterAcc(WebDriver wd) {
        return wd.findElement(By.xpath(twitterAccXpath));
    }

    public static void clickTwitterAcc(WebDriver wd) {
        getTwitterAcc(wd).click();
    }

    public static WebElement getYouTubeAcc(WebDriver wd) {
        return wd.findElement(By.xpath(youTubeAccXpath));
    }

    public static void clickYouTubeAcc(WebDriver wd) {
        getYouTubeAcc(wd).click();
    }

    public static WebElement getGooglePlusAcc(WebDriver wd) {
        return wd.findElement(By.xpath(googlePlusAccXpath));
    }

    public static void clickGooglePlusAcc(WebDriver wd) {
        getGooglePlusAcc(wd).click();
    }
}
