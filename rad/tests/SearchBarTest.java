package rad.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import rad.objects.IndexPage;
import rad.objects.SearchBar;
import rad.utility.WebDriverCreator;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchBarTest {

    @BeforeTest
    public static void openWebDriver() {
        WebDriverCreator.createWebDriver();
        WebDriverCreator.wd.get(IndexPage.indexPageURL);
        SearchBar.sendSearchYellow(WebDriverCreator.wd);
        SearchBar.clickSubmitSearch(WebDriverCreator.wd);
    }

    @Test
    public static void numOfResults() {
        SoftAssert sa = new SoftAssert();

        // checking is it there 3 boxes for searched items
        WebDriverCreator.wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> itemsAfterSearch = WebDriverCreator.wd.findElements(By.className("ajax_block_product"));
        sa.assertEquals(itemsAfterSearch.size(), SearchBar.numbOfSearchResults);

        // checking search result text
        sa.assertEquals(SearchBar.getTextNumbOfSearch(WebDriverCreator.wd), SearchBar.textNumbOfSearch);

        sa.assertAll();
    }

    @Test
    public static void testYellowSearch() {
        WebDriverCreator.wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        boolean haveKeyWord = false;
        List<WebElement> itemsAfterSearch = WebDriverCreator.wd.findElements(By.className("color_to_pick_list"));
        for (int i = 0; i < itemsAfterSearch.size(); i++) {
            List<WebElement> itemsAfterSearchListColor = itemsAfterSearch.get(i).findElements(By.className("color_pick"));
            for (int j = 0; j < itemsAfterSearchListColor.size(); j++) {
                if (itemsAfterSearchListColor.get(j).getAttribute("style").contains("background: rgb(241, 196, 15);")) {
                    haveKeyWord = true;
                }
            }
        }
        // checking those searched items have yellow color
        Assert.assertEquals(haveKeyWord, true);
    }

    @AfterTest
    public static void closeWebDriver() {
        WebDriverCreator.closeWebDriver();
    }
}