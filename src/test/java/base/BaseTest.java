package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class BaseTest {

    public static AppiumDriver<MobileElement> driver;

    public WebDriverWait wait;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability("deviceName", "emulator");
        capabilities.setCapability("appPackage", "com.getir.getirtestingcasestudy");
        capabilities.setCapability("appActivity", "com.getir.getirtestingcasestudy.ui.login.LoginActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void End() {
        driver.quit();
    }
}