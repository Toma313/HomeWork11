package config;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    static public WebDriver driver;
    @BeforeClass
    public static void start01() {
        BaseClass.driver= DriverConfig.createDriver(Browsers.CHROMEINCOGNITO);
    }
    @AfterClass
    public static void End() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
