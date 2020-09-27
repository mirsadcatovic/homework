package rad.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import rad.objects.IndexPage;
import rad.objects.SummerDresses;
import rad.utility.WebDriverCreator;

public class SummerDressesFromWomenTest {

    @BeforeTest
    public static void openWebDriver() {
        WebDriverCreator.createWebDriver();
        WebDriverCreator.wd.get(IndexPage.indexPageURL);
    }

    @Test
    public static void womanSummerDresses() {
        SoftAssert sa = new SoftAssert();

        // checking is it women link visible
        sa.assertTrue(IndexPage.getWomen(WebDriverCreator.wd).isDisplayed());
        IndexPage.moveToWomen(WebDriverCreator.wd);

        // checking is it summer dresses link visible
        sa.assertTrue(IndexPage.getWomenSummerDresses(WebDriverCreator.wd).isDisplayed());

        IndexPage.clickWomenSummerDresses(WebDriverCreator.wd);

        // checking summer dresses link go to right address
        sa.assertEquals(WebDriverCreator.wd.getCurrentUrl(), SummerDresses.womenSummerDressesURL);

        sa.assertAll();
    }

    @AfterTest
    public static void closeWebDriver() {
        WebDriverCreator.closeWebDriver();
    }
}