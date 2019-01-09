package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPageConstants extends BasePage {
    public LoginPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public By USERNAME = By.id("com.getir.getirtestingcasestudy:id/email");
    public By PASSWORD = By.id("com.getir.getirtestingcasestudy:id/password");
    public By LOGINBUTTON = By.id("com.getir.getirtestingcasestudy:id/email_sign_in_button");
}