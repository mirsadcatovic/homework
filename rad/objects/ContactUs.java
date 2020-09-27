package rad.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {
    public static String contactUsUpXpath = "//div[@id='contact-link']//a[contains(text(),'Contact us')]";
    public static String contactUsDownXpath = "//li[@class='item']//a[contains(text(),'Contact us')]";
    public static String subjectHeadingXpath = "//select[@id='id_contact']";
    public static String choseSubjectHeading = "1";
    public static String emailAddressXpath = "//input[@id='email']";
    public static String emailAddress = "pera@gmail.com";
    public static String attachFileXpath = "//input[@id='fileUpload']";
    public static String fileLocation = "D:\\MIRSAD\\IT BootCamp QA\\download.jpg";
    public static String messageXpath = "//textarea[@id='message']";
    public static String message = "Hello to everybody 123#@!_{.";
    public static String buttonSendXpath = "//span[contains(text(),'Send')]";
    public static String sendSuccessXpath = "//p[@class='alert alert-success']";
    public static String returnHomeXpath = "//div[@class='columns-container']//div[@class='row']//span[1]";

    public static WebElement getContactUsUp(WebDriver wd) {
        return wd.findElement(By.xpath(contactUsUpXpath));
    }

    public static void clickContactUsUp(WebDriver wd) {
        getContactUsUp(wd).click();
    }

    public static WebElement getContactUsDown(WebDriver wd) {
        return wd.findElement(By.xpath(contactUsDownXpath));
    }

    public static void clickContactUsDown(WebDriver wd) {
        getContactUsDown(wd).click();
    }

    public static WebElement getSubjectHeading(WebDriver wd) {
        return wd.findElement(By.xpath(subjectHeadingXpath));
    }

    public static void selectSubjectHeading(WebDriver wd, String index) {
        Select select = new Select(getSubjectHeading(wd));
        select.selectByValue(index);
    }

    public static WebElement getEmailAddress(WebDriver wd) {
        return wd.findElement(By.xpath(emailAddressXpath));
    }

    public static void setEmailAddress(WebDriver wd, String eMail) {
        getEmailAddress(wd).sendKeys(eMail);
    }

    public static WebElement getAttachFile(WebDriver wd) {
        return wd.findElement(By.xpath(attachFileXpath));
    }

    public static void clickAndAttachFile(WebDriver wd) {
        getAttachFile(wd).sendKeys(fileLocation);
    }

    public static WebElement getMessage(WebDriver wd) {
        return wd.findElement(By.xpath(messageXpath));
    }

    public static void setMessage(WebDriver wd, String message) {
        getMessage(wd).sendKeys(message);
    }

    public static WebElement getButtonSend(WebDriver wd) {
        return wd.findElement(By.xpath(buttonSendXpath));
    }

    public static void clickButtonSend(WebDriver wd) {
        getButtonSend(wd).click();
    }

    public static WebElement getSendSuccess(WebDriver wd) {
        return wd.findElement(By.xpath(sendSuccessXpath));
    }

    public static boolean checkSendSuccess(WebDriver wd) {
        if (getSendSuccess(wd).isDisplayed()) {
            return true;
        } else
            return false;
    }

    public static WebElement getReturnHome(WebDriver wd) {
        return wd.findElement(By.xpath(returnHomeXpath));
    }

    public static void clickReturnHome(WebDriver wd) {
        getReturnHome(wd).click();
    }
}
