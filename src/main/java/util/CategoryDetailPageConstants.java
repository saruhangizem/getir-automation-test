package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class CategoryDetailPageConstants extends BasePage {
    public CategoryDetailPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public By ACTIONBAR = By.id("com.getir.getirtestingcasestudy:id/action_bar");
    public By PRODUCTNAME= By.id("com.getir.getirtestingcasestudy:id/product_name");
    public By IMAGEBUTTONCLASS = By.className("android.widget.ImageButton");
    public By BASKETICON = By.id("com.getir.getirtestingcasestudy:id/basket");
}