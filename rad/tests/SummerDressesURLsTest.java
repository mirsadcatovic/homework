package rad.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import rad.objects.IndexPage;
import rad.utility.WebDriverCreator;

public class SummerDressesURLsTest {

    @BeforeTest
    public static void openWebDriver() {
        WebDriverCreator.createWebDriver();
        WebDriverCreator.wd.get(IndexPage.indexPageURL);
    }

    @Test
    public static void compareSummerDressesURLs() {
        IndexPage.moveToWomen(WebDriverCreator.wd);
        IndexPage.clickWomenSummerDresses(WebDriverCreator.wd);
        String URL1 = WebDriverCreator.wd.getCurrentUrl();

        WebDriverCreator.wd.navigate().back();

        IndexPage.moveToDresses(WebDriverCreator.wd);
        IndexPage.clickDressesSummerDresses(WebDriverCreator.wd);
        String URL2 = WebDriverCreator.wd.getCurrentUrl();

        SoftAssert sa = new SoftAssert();

        // checking that two Summer Dresses links have same address
        sa.assertEquals(URL1, URL2);

        sa.assertAll();
    }

    @AfterTest
    public static void closeWebDriver() {
        WebDriverCreator.closeWebDriver();
    }
}