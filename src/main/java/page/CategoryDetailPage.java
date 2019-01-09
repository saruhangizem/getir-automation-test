package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.CategoryDetailPageConstants;

public class CategoryDetailPage extends CategoryDetailPageConstants {
    public CategoryDetailPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public CategoryDetailPage clickProduct(){
        waitAndFindElement(PRODUCTNAME).click();
        return this;
    }

    public CategoriesPage clickBackButton(){
        waitAndFindElement(ACTIONBAR).findElements(IMAGEBUTTONCLASS).get(0).click();
        return new CategoriesPage(driver);
    }

    public BasketPage clickBasketIcon(){
        waitAndFindElement(BASKETICON).click();
        return new BasketPage(driver);
    }
}