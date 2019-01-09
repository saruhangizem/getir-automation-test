package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.CategoriesPageConstants;

public class CategoriesPage extends CategoriesPageConstants {
    public CategoriesPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public CategoryDetailPage clickHomeCareCategory(){
        waitAndFindElement(CATEGORIES).findElements(TEXTVIEWCLASS).get(0).click();
        return new CategoryDetailPage(driver);
    }

    public CategoryDetailPage clickPersonalCareCategory(){
        waitAndFindElement(CATEGORIES).findElements(TEXTVIEWCLASS).get(2).click();
        return new CategoryDetailPage(driver);
    }
}