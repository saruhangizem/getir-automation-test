package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BasketPageConstants extends BasePage {
    public BasketPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public By PRODUCTNAME = By.id("com.getir.getirtestingcasestudy:id/product_name");
    public By DELETEONBASKETICON = By.id("com.getir.getirtestingcasestudy:id/imageview_remove");
    public By EMPTYPAGETEXT = By.id("com.getir.getirtestingcasestudy:id/empty_textview");
}