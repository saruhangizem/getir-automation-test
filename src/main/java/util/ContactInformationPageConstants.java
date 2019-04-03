package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ContactInformationPageConstants extends BasePage {
    public ContactInformationPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public By TEXT_VIEW_CLASS = By.className("android.widget.TextView");
    public By EDIT_TEXT_CLASS = By.className("android.widget.EditText");

    public String address = "merkez mah.";

}