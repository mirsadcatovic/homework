package rad.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import rad.objects.SummerDresses;
import rad.utility.WebDriverCreator;

import java.util.List;

public class OrderTwoDressesTest {

    @BeforeTest
    public static void openWebDriver() {
        WebDriverCreator.createWebDriver();
        WebDriverCreator.wd.get(SummerDresses.summerDressesURL);
    }

    @Test
    public static void orderTwoDress() {
        SoftAssert sa = new SoftAssert();

        // check is there minimum two search results and than click on second search result
        List<WebElement> itemsAfterSearch = WebDriverCreator.wd.findElements(By.className("ajax_block_product"));
        sa.assertTrue(itemsAfterSearch.get(1).isDisplayed());
        SummerDresses.clickSecondSummerDress(WebDriverCreator.wd);

        SummerDresses.clickPlusQuantitySecondSummerDress(WebDriverCreator.wd);
        SummerDresses.setSizeSecondSummerDress(WebDriverCreator.wd);
        SummerDresses.clickWhiteColorSecondSummerDress(WebDriverCreator.wd);
        SummerDresses.clickAddToCard(WebDriverCreator.wd);

        sa.assertAll();
    }

    @AfterTest
    public static void closeWebDriver() {
        WebDriverCreator.closeWebDriver();
    }
}