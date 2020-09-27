package zadatak1.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Account {
    public static String userNameXpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
    public static String passwordXpath = "//input[@name='password']";
    public static String logInXpath = "//input[@name='signon']";
    public static String registerNowXpath = "//a[contains(text(),'Register Now!')]";

    public static WebElement getUserName(WebDriver wd){
        return wd.findElement(By.xpath(userNameXpath));
    }

    public static void setUserName(WebDriver wd, String userName){
        getUserName(wd).sendKeys(userName);
    }

    public static WebElement getPassword(WebDriver wd){
        return wd.findElement(By.xpath(passwordXpath));
    }

    public static void setPassword(WebDriver wd, String password){
        getPassword(wd).sendKeys(password);
    }

    public static WebElement getLogIn(WebDriver wd){
        return wd.findElement(By.xpath(logInXpath));
    }

    public static void clickLogIn(WebDriver wd){
        getLogIn(wd).click();
    }

    public static WebElement getRegisterNow(WebDriver wd){
        return wd.findElement(By.xpath(registerNowXpath));
    }

    public static void clickRegisterNow(WebDriver wd){
        getRegisterNow(wd).click();
    }
}
