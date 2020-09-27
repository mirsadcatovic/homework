package rad.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBar {
    public static String searchBarXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]";
    public static String submitSearchXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]";
    public static String searchTerm = "yellow";
    public static int numbOfSearchResults = 3;
    public static String textNumbOfSearchResultsXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/h1[1]/span[2]";
    public static String textNumbOfSearch = "3 results have been found.";

    public static WebElement getSearchBar(WebDriver wd) {
        return wd.findElement(By.xpath(searchBarXpath));
    }

    public static void sendSearchYellow(WebDriver wd) {
        getSearchBar(wd).sendKeys(searchTerm);
    }

    public static WebElement getSubmitSearch(WebDriver wd) {
        return wd.findElement(By.xpath(submitSearchXpath));
    }

    public static void clickSubmitSearch(WebDriver wd) {
        getSubmitSearch(wd).click();
    }

    public static String getTextNumbOfSearch(WebDriver wd) {
        if (!(wd.findElement(By.xpath(textNumbOfSearchResultsXpath)).getText()).contains(textNumbOfSearch)) {
            return "";
        } else
            return textNumbOfSearch;
    }
}
