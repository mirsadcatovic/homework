package rad.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import rad.objects.BottomMenu;
import rad.objects.IndexPage;
import rad.utility.WebDriverCreator;

import java.util.ArrayList;

public class SocialMediaAccountsTest {

    @BeforeTest
    public static void openWebDriver() {
        WebDriverCreator.createWebDriver();
        WebDriverCreator.wd.get(IndexPage.indexPageURL);
    }

    @Test
    public static void checkFacebookTest() {
        BottomMenu.clickFacebookAcc(WebDriverCreator.wd);
        ArrayList<String> tabs = new ArrayList<>(WebDriverCreator.wd.getWindowHandles());
        WebDriverCreator.wd.switchTo().window(tabs.get(1));
        String faceBookURL = WebDriverCreator.wd.getCurrentUrl();
        WebDriverCreator.closeWebDriver();
        WebDriverCreator.wd.switchTo().window(tabs.get(0));

        SoftAssert sa = new SoftAssert();

        // checking that FaceBook account link have right address
        sa.assertEquals(faceBookURL, BottomMenu.facebookAccURL);

        sa.assertAll();
    }

    @Test
    public static void checkTwitterTest() {
        BottomMenu.clickTwitterAcc(WebDriverCreator.wd);
        ArrayList<String> tabs = new ArrayList<>(WebDriverCreator.wd.getWindowHandles());
        WebDriverCreator.wd.switchTo().window(tabs.get(1));
        String twitterURL = WebDriverCreator.wd.getCurrentUrl();
        WebDriverCreator.wd.close();
        WebDriverCreator.wd.switchTo().window(tabs.get(0));

        SoftAssert sa = new SoftAssert();

        // checking that Twitter account link have right address
        sa.assertEquals(twitterURL, BottomMenu.twitterAccURL);

        sa.assertAll();
    }

    @Test
    public static void checkYouTubeTest() {
        BottomMenu.clickYouTubeAcc(WebDriverCreator.wd);
        ArrayList<String> tabs = new ArrayList<>(WebDriverCreator.wd.getWindowHandles());
        WebDriverCreator.wd.switchTo().window(tabs.get(1));
        String youtubeURL = WebDriverCreator.wd.getCurrentUrl();
        WebDriverCreator.wd.close();
        WebDriverCreator.wd.switchTo().window(tabs.get(0));

        SoftAssert sa = new SoftAssert();

        // checking that YouTube account link have right address
        sa.assertEquals(youtubeURL, BottomMenu.youTubeAccURL);

        sa.assertAll();
    }

    @Test
    public static void checkGooglePlusTest() {
        BottomMenu.clickGooglePlusAcc(WebDriverCreator.wd);
        ArrayList<String> tabs = new ArrayList<>(WebDriverCreator.wd.getWindowHandles());
        WebDriverCreator.wd.switchTo().window(tabs.get(1));
        String googlePlusURL = WebDriverCreator.wd.getCurrentUrl();
        WebDriverCreator.wd.close();
        WebDriverCreator.wd.switchTo().window(tabs.get(0));

        SoftAssert sa = new SoftAssert();

        // checking that GooglePlus account link have right address
        sa.assertEquals(googlePlusURL, BottomMenu.googlePlusAccURL);

        sa.assertAll();
    }

    @AfterTest
    public static void closeWebDriver() {
        WebDriverCreator.closeWebDriver();
    }
}