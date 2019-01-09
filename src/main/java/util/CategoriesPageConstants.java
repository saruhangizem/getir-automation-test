package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class CategoriesPageConstants extends BasePage {
    public CategoriesPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public By CATEGORIES = By.id("com.getir.getirtestingcasestudy:id/categories");
    public By TEXTVIEWCLASS = By.className("android.widget.TextView");
}