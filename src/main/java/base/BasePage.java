package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class BasePage {

    protected AppiumDriver<MobileElement> driver;

    public BasePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public WebElement waitAndFindElement(By id) {
        WebDriverWait wait = new WebDriverWait(driver, 30, 1000);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(id));
    }

    public List<MobileElement> waitAndFindElements(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, 30, 1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        List<MobileElement> elements = driver.findElements(selector);
        return elements;
    }

    public boolean isExist(By selector, int second) {
        try {
            waitSeconds(10);
            waitAndFindElement(selector);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}