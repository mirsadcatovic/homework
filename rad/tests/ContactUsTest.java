package rad.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import rad.objects.ContactUs;
import rad.objects.IndexPage;
import rad.utility.ReadQuestions;
import rad.utility.WebDriverCreator;

import java.util.concurrent.TimeUnit;

public class ContactUsTest {

    @BeforeTest
    public static void openWebDriver() {
        WebDriverCreator.createWebDriver();
        WebDriverCreator.wd.get(IndexPage.indexPageURL);
    }

    @Test
    public static void send1Message() {
        ContactUs.clickContactUsUp(WebDriverCreator.wd);
        String contactUsUpURL = WebDriverCreator.wd.getCurrentUrl();

        WebDriverCreator.wd.navigate().back();

        ContactUs.clickContactUsDown(WebDriverCreator.wd);
        String contactUsDownURL = WebDriverCreator.wd.getCurrentUrl();

        WebDriverCreator.wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ContactUs.selectSubjectHeading(WebDriverCreator.wd, ContactUs.choseSubjectHeading);
        ContactUs.setEmailAddress(WebDriverCreator.wd, ContactUs.emailAddress);
        ContactUs.clickAndAttachFile(WebDriverCreator.wd);
        ContactUs.setMessage(WebDriverCreator.wd, ContactUs.message);
        ContactUs.clickButtonSend(WebDriverCreator.wd);

        SoftAssert sa = new SoftAssert();

        // checking is it 1 message sent successfully
        sa.assertTrue(ContactUs.checkSendSuccess(WebDriverCreator.wd));

        // checking that two Contact Us links have same address
        sa.assertEquals(contactUsUpURL, contactUsDownURL);

        sa.assertAll();
    }

    @Test
    public static void send30Messages() {
        int counter = 0;
        int numOfQuestions = 30;
        for (int i = 0; i < numOfQuestions; i++) {
            WebDriverCreator.wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            ContactUs.clickContactUsUp(WebDriverCreator.wd);

            WebDriverCreator.wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            ContactUs.selectSubjectHeading(WebDriverCreator.wd, ContactUs.choseSubjectHeading);
            ContactUs.setEmailAddress(WebDriverCreator.wd, ReadQuestions.catchCell(i, 1));
            ContactUs.clickAndAttachFile(WebDriverCreator.wd);
            ContactUs.setMessage(WebDriverCreator.wd, ReadQuestions.catchCell(i, 0));
            ContactUs.clickButtonSend(WebDriverCreator.wd);

            SoftAssert sa = new SoftAssert();

            // checking is it 1 message sent successfully
            sa.assertTrue(ContactUs.checkSendSuccess(WebDriverCreator.wd));
            sa.assertAll();

            counter++;
            ContactUs.clickReturnHome(WebDriverCreator.wd);
        }
        // checking is it 30 messages sent
        Assert.assertEquals(counter, numOfQuestions);
    }

    @AfterTest
    public static void closeWebDriver() {
        WebDriverCreator.closeWebDriver();
    }
}
