package zadatak1.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountForm {
    public static String userIDXpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
    public static String newPasswordXpath = "//input[@name='password']";
    public static String repetePasswordXpath = "//input[@name='repeatedPassword']";
    public static String firstNameXpath = "//input[@name='account.firstName']";
    public static String lastNameXpath = "//input[@name='account.lastName']";
    public static String eMailXpath = "//input[@name='account.email']";
    public static String phoneXpath = "//input[@name='account.phone']";
    public static String address1Xpath = "//input[@name='account.address1']";
    public static String address2Xpath = "//input[@name='account.address2']";
    public static String cityXpath = "//input[@name='account.city']";
    public static String stateXpath = "//input[@name='account.state']";
    public static String zipXpath = "//input[@name='account.zip']";
    public static String countryXpath = "//input[@name='account.country']";
    public static String langPreferenceXpath = "//select[@name='account.languagePreference']";
    public static String favCategoryXpath = "//select[@name='account.favouriteCategoryId']";
    public static String myListXpath = "//input[@name='account.listOption']";
    public static String myBannerXpath = "//input[@name='account.bannerOption']";
    public static String saveAccountXpath = "//input[@name='newAccount']";

    public static WebElement getUserID(WebDriver wd){
        return wd.findElement(By.xpath(userIDXpath));
    }
    public static void setUserID(WebDriver wd, String ID){
        getUserID(wd).sendKeys(ID);
    }

    public static WebElement getNewPassword(WebDriver wd){
        return wd.findElement(By.xpath(newPasswordXpath));
    }

    public static void setNewPassword(WebDriver wd, String newPass){
        getNewPassword(wd).sendKeys(newPass);
    }

    public static WebElement getRepetePassword(WebDriver wd){
        return wd.findElement(By.xpath(repetePasswordXpath));
    }

    public static void setRepetePassword(WebDriver wd, String repetePass){
        getRepetePassword(wd).sendKeys(repetePass);
    }
    public static WebElement getFirstName(WebDriver wd){
        return wd.findElement(By.xpath(firstNameXpath));
    }

    public static void setFirstName (WebDriver wd, String firstName){
        getFirstName(wd).sendKeys(firstName);
    }

    public static WebElement getLastName(WebDriver wd){
        return wd.findElement(By.xpath(lastNameXpath));
    }

    public static void setLastName(WebDriver wd, String lastName){
        getLastName(wd).sendKeys(lastName);
    }

    public static WebElement getEmail(WebDriver wd){
        return wd.findElement(By.xpath(eMailXpath));
    }

    public static void setEmail(WebDriver wd, String email){
        getEmail(wd).sendKeys(email);
    }

    public static WebElement getPhone(WebDriver wd){
        return wd.findElement(By.xpath(phoneXpath));
    }

    public static void setPhone(WebDriver wd, String phone){
        getPhone(wd).sendKeys(phone);
    }

    public static WebElement getAddress1(WebDriver wd){
        return wd.findElement(By.xpath(address1Xpath));
    }

    public static void setAddress1(WebDriver wd, String address1){
        getAddress1(wd).sendKeys(address1);
    }

    public static WebElement getAddress2(WebDriver wd){
        return wd.findElement(By.xpath(address2Xpath));
    }

    public static void setAddress2(WebDriver wd, String address2){
        getAddress2(wd).sendKeys(address2);
    }

    public static WebElement getCity(WebDriver wd){
        return wd.findElement(By.xpath(cityXpath));
    }

    public static void setCity(WebDriver wd, String city){
        getCity(wd).sendKeys(city);
    }

    public static WebElement getState(WebDriver wd){
        return wd.findElement(By.xpath(stateXpath));
    }

    public static void setState(WebDriver wd, String state){
        getState(wd).sendKeys(state);
    }

    public static WebElement getZip(WebDriver wd){
        return wd.findElement(By.xpath(zipXpath));
    }

    public static void setZip(WebDriver wd, String zip){
        getZip(wd).sendKeys(zip);
    }

    public static WebElement getCountry(WebDriver wd){
        return wd.findElement(By.xpath(countryXpath));
    }

    public static void setCountry(WebDriver wd, String country){
        getCountry(wd).sendKeys(country);
    }

    public static WebElement getLangPreference(WebDriver wd){
        return wd.findElement(By.xpath(langPreferenceXpath));
    }

    public static Select selectLangPreference(WebDriver wd){
        return new Select(getLangPreference(wd));
    }

    public static void setLangPreference(WebDriver wd, String langPreference){
        selectLangPreference(wd).selectByVisibleText(langPreference);
    }

//    public static void setLangPreference(WebDriver wd, String langPreference){
//        getLangPreference(wd).sendKeys(langPreference);
//    }

    public static WebElement getFavCategory(WebDriver wd){
        return wd.findElement(By.xpath(favCategoryXpath));
    }
    public static Select selectFavCategory(WebDriver wd){
        return new Select(getFavCategory(wd));
    }

    public static void setFavCategory(WebDriver wd, String favCategory){
        selectFavCategory(wd).selectByVisibleText(favCategory);
    }

//    public static void setFavCategory(WebDriver wd, String favCategory){
//        getFavCategory(wd).sendKeys(favCategory);
//    }

    public static WebElement getMyList(WebDriver wd){
        return wd.findElement(By.xpath(myListXpath));
    }

//    public static void setMyList(WebDriver wd, String myList){
//        getMyList(wd).sendKeys(myList);
//    }

    public static void clickMyList(WebDriver wd){
        getMyList(wd).click();
    }

    public static WebElement getMyBanner(WebDriver wd){
        return wd.findElement(By.xpath(myBannerXpath));
    }

//    public static void setMyBanner(WebDriver wd, String myBanner){
//        getMyBanner(wd).sendKeys(myBanner);
//    }

    public static void clickMyBanner(WebDriver wd){
        getMyBanner(wd).click();
    }

    public static WebElement getSaveAccount(WebDriver wd){
        return wd.findElement(By.xpath(saveAccountXpath));
    }

    public static void clickSaveAccount(WebDriver wd){
        getSaveAccount(wd).click();
    }
}
