package zadatak1.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webtables {
    public static String webtableURL = "https://demoqa.com/webtables";
    public static String deleteRow1CssSelector = "#delete-record-1";
    public static String deleteRow2CssSelector = "#delete-record-2";
    public static String editRow3Xpath = "//*[name()='path' and contains(@d,'M880 836H1')]";
    public static String lastNameXpath = "//input[@id='lastName']";
    public static String changeLastName = "Petrovic";
    public static String submit = "#submit";
    public static String addXpath = "//button[@id='addNewRecordButton']";
    public static String firstNameXpath = "//input[@id='firstName']";
    public static String eMailXpath = "//input[@id='userEmail']";
    public static String ageXpath = "//input[@id='age']";
    public static String salaryXpath = "//input[@id='salary']";
    public static String departmentXpath = "//input[@id='department']";
    public static String newPersonFirstName = "Petar";
    public static String newPersonLastName = "Petrovic";
    public static String newPersonEmail = "petar@gmail.com";
    public static String newPersonAge = "30";
    public static String newPersonSalary = "1800";
    public static String newPersonDepartment = "Insurance";

    public static WebElement getDeleteRow1(WebDriver wd){
        return wd.findElement(By.cssSelector(deleteRow1CssSelector));
    }

    public static void clickDeleteRow1(WebDriver wd){
        getDeleteRow1(wd).click();
    }

    public static WebElement getDeleteRow2(WebDriver wd){
        return wd.findElement(By.cssSelector(deleteRow2CssSelector));
    }

    public static void clickDeleteRow2(WebDriver wd){
        getDeleteRow2(wd).click();
    }

    public static WebElement getEditRow3(WebDriver wd){
        return wd.findElement(By.xpath(editRow3Xpath));
    }

    public static void clickEditRow3(WebDriver wd){
        getEditRow3(wd).click();
    }

    public static WebElement getLastName(WebDriver wd){
        return wd.findElement(By.xpath(lastNameXpath));
    }

    public static void setLastName(WebDriver wd, String lastName){
        getLastName(wd).sendKeys(lastName);
    }

    public static WebElement getSubmit(WebDriver wd){
        return wd.findElement(By.cssSelector(submit));
    }

    public static void clickSubmit(WebDriver wd){
        getSubmit(wd).click();
    }

    public static WebElement getAdd(WebDriver wd){
        return wd.findElement(By.xpath(addXpath));
    }

    public static void clickAdd(WebDriver wd){
        getAdd(wd).click();
    }

    public static WebElement getFirstName(WebDriver wd){
        return wd.findElement(By.xpath(firstNameXpath));
    }

    public static void setFirstName(WebDriver wd, String firstName){
        getFirstName(wd).sendKeys(firstName);
    }

    public static WebElement getEmail(WebDriver wd){
        return wd.findElement(By.xpath(eMailXpath));
    }

    public static void setEmail(WebDriver wd, String eMail){
        getEmail(wd).sendKeys(eMail);
    }

    public static WebElement getAge(WebDriver wd){
        return wd.findElement(By.xpath(ageXpath));
    }

    public static void setAge(WebDriver wd, String age){
        getAge(wd).sendKeys(age);
    }

    public static WebElement getSalery(WebDriver wd){
        return wd.findElement(By.xpath(salaryXpath));
    }

    public static void setSalery(WebDriver wd, String salary){
        getSalery(wd).sendKeys(salary);
    }

    public static WebElement getDepartment(WebDriver wd){
        return wd.findElement(By.xpath(departmentXpath));
    }

    public static void setDepartment(WebDriver wd, String department){
        getDepartment(wd).sendKeys(department);
    }
}