package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class RegionDetailPageConstants extends BasePage {
    public RegionDetailPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public By IMAGE_VIEW_CLASS = By.className("android.widget.ImageView");
    public By EDIT_TEXT_CLASS = By.className("android.widget.EditText");
    public By TEXT_VIEW_CLASS = By.className("android.widget.TextView");

    public String searchTextWithReturnResult = "Region1";
    public String searchTextWithNoResult = "Region1234";

}