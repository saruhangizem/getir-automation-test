package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class CityDetailPageConstants extends BasePage {
    public CityDetailPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public By IMAGE_VIEW_CLASS = By.className("android.widget.ImageView");
    public By EDIT_TEXT_CLASS = By.className("android.widget.EditText");
    public By TEXT_VIEW_CLASS = By.className("android.widget.TextView");

    public String searchTextWithReturnResult = "City1";
    public String searchTextWithNoResult = "City1234";

}