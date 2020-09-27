package rad.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOrder {
    public static String quantityBoxXpath = "//input[@name='quantity_6_41_0_0']";
    public static String dressNameXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/p[1]/a[1]";
    public static String dressModelXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/small[1]";
    public static String dressColorXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/small[2]/a[1]";
    public static String dressSizeXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/small[2]/a[1]";
    public static String quantityBoxAttribute = "value";
    public static String dressModelName = "demo_6";
    public static String dressColorName = "Color : White";
    public static String dressSizeName = "Size : M";
    public static String dressQuantity = "2";
    public static String dressColor = "White";
    public static String dressSize = "M";

    public static String getValueQuantityBox(WebDriver wd) {
        return wd.findElement(By.xpath(quantityBoxXpath)).getAttribute(quantityBoxAttribute);
    }

    public static String getDressName(WebDriver wd) {
        return wd.findElement(By.xpath(dressNameXpath)).getText();
    }

    public static String getDressModel(WebDriver wd) {
        if (!(wd.findElement(By.xpath(dressModelXpath)).getText()).contains(dressModelName)) {
            return "";
        } else
            return dressModelName;
    }

    public static String getDressColor(WebDriver wd) {
        if (!(wd.findElement(By.xpath(dressColorXpath)).getText()).contains(dressColorName)) {
            return "";
        } else
            return dressColor;
    }

    public static String getDressSize(WebDriver wd) {
        if (!(wd.findElement(By.xpath(dressSizeXpath)).getText()).contains(dressSizeName)) {
            return "";
        } else
            return dressSize;
    }
}