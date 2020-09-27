package zadatak1.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sortable {
    public static String sortableURL = "https://demoqa.com/sortable";
    public static String gridXpath = "//a[@id='demo-tab-grid']";
    public static String oneXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'One')]";
    public static String twoXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Two')]";
    public static String threeXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Three')]";
    public static String fourXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Four')]";
    public static String fiveXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Five')]";
    public static String sixXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Six')]";
    public static String sevenXpath = "//div[contains(text(),'Seven')]";
    public static String eigthXpath = "//div[contains(text(),'Eight')]";
    public static String nineXpath = "//div[contains(text(),'Nine')]";

    public static WebElement getGrid(WebDriver wd){
        return wd.findElement(By.xpath(gridXpath));
    }

    public static void clickGrid(WebDriver wd){
        getGrid(wd).click();
    }

    public static WebElement getOne(WebDriver wd){
        return wd.findElement(By.xpath(oneXpath));
    }

    public static WebElement getTwo(WebDriver wd){
        return wd.findElement(By.xpath(twoXpath));
    }
    public static WebElement getThree(WebDriver wd){
        return wd.findElement(By.xpath(threeXpath));
    }
    public static WebElement getFour(WebDriver wd){
        return wd.findElement(By.xpath(fourXpath));
    }
    public static WebElement getFive(WebDriver wd){
        return wd.findElement(By.xpath(fiveXpath));
    }
    public static WebElement getSix(WebDriver wd){
        return wd.findElement(By.xpath(sixXpath));
    }
    public static WebElement getSeven(WebDriver wd){
        return wd.findElement(By.xpath(sevenXpath));
    }
    public static WebElement getEight(WebDriver wd){
        return wd.findElement(By.xpath(eigthXpath));
    }
    public static WebElement getNine(WebDriver wd){
        return wd.findElement(By.xpath(nineXpath));
    }
}