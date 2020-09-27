package rad.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import rad.objects.CheckOrder;
import rad.objects.SummerDresses;
import rad.utility.WebDriverCreator;

import java.util.concurrent.TimeUnit;

public class CheckOrderTest {

    @BeforeTest
    public static void openWebDriver() {
        WebDriverCreator.createWebDriver();
        WebDriverCreator.wd.get(SummerDresses.summerDressesURL);
    }

    @Test
    public static void checkDressesOrder() {
        SummerDresses.clickSecondSummerDress(WebDriverCreator.wd);

        String dressName1 = SummerDresses.getDressName(WebDriverCreator.wd);
        String dressModel1 = SummerDresses.getDressModel(WebDriverCreator.wd);

        SummerDresses.clickPlusQuantitySecondSummerDress(WebDriverCreator.wd);

        SummerDresses.setSizeSecondSummerDress(WebDriverCreator.wd);

        SummerDresses.clickWhiteColorSecondSummerDress(WebDriverCreator.wd);

        SummerDresses.clickAddToCard(WebDriverCreator.wd);

        WebDriverCreator.wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SummerDresses.clickProceedToCheckout(WebDriverCreator.wd);

        String dressName2 = CheckOrder.getDressName(WebDriverCreator.wd);
        String dressModel2 = CheckOrder.getDressModel(WebDriverCreator.wd);
        String realQuantityValue = CheckOrder.getValueQuantityBox(WebDriverCreator.wd);
        String realDressColor = CheckOrder.getDressColor(WebDriverCreator.wd);
        String realDressSize = CheckOrder.getDressSize(WebDriverCreator.wd);

        SoftAssert sa = new SoftAssert();

        // checking name of ordered item
        sa.assertEquals(dressName2, dressName1);

        // checking model of ordered item
        sa.assertEquals(dressModel2, dressModel1);

        // checking quantity of ordered item
        sa.assertEquals(realQuantityValue, CheckOrder.dressQuantity);

        // checking color of ordered item
        sa.assertEquals(realDressColor, CheckOrder.dressColor);

        // checking size of ordered item
        sa.assertEquals(realDressSize, CheckOrder.dressSize);

        WebDriverCreator.wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        sa.assertAll();
    }

    @AfterTest
    public static void closeWebDriver() {
        WebDriverCreator.closeWebDriver();
    }
}
