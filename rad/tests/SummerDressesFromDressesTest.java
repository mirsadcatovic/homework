package rad.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import rad.objects.IndexPage;
import rad.objects.SummerDresses;
import rad.utility.WebDriverCreator;

public class SummerDressesFromDressesTest {

    @BeforeTest
    public static void openWebDriver() {
        WebDriverCreator.createWebDriver();
        WebDriverCreator.wd.get(IndexPage.indexPageURL);
    }

    @Test
    public static void dressesSummerDresses() {
        SoftAssert sa = new SoftAssert();

        // checking is it dresses link visible
        sa.assertTrue(IndexPage.getDresses(WebDriverCreator.wd).isDisplayed());
        IndexPage.moveToDresses(WebDriverCreator.wd);

        // checking is it summer dresses link visible
        sa.assertTrue(IndexPage.getDressesSummerDresses(WebDriverCreator.wd).isDisplayed());

        IndexPage.clickDressesSummerDresses(WebDriverCreator.wd);

        // checking summer dresses link go to right address
        sa.assertEquals(WebDriverCreator.wd.getCurrentUrl(), SummerDresses.dressesSummerDressesURL);

        sa.assertAll();
    }

    @AfterTest
    public static void closeWebDriver() {
        WebDriverCreator.closeWebDriver();
    }
}