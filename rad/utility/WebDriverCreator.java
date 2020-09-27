package rad.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCreator {
    public static WebDriver wd;

    public static void createWebDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
    }

    public static void closeWebDriver() {
        wd.close();
    }
}