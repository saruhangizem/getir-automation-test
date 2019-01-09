package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.LoginPageConstants;

public class LoginPage extends LoginPageConstants {
    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public LoginPage sendUserName(){
        waitAndFindElement(USERNAME).sendKeys("hello@getir.com");
        return this;
    }

    public LoginPage sendPassword(){
        waitAndFindElement(PASSWORD).sendKeys("hello");
        return this;
    }

    public CategoriesPage clickLoginButton(){
        waitAndFindElement(LOGINBUTTON).click();
        return new CategoriesPage(driver);
    }

}