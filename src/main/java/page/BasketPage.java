package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.BasketPageConstants;

public class BasketPage extends BasketPageConstants {
    public BasketPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public boolean areTwoProductsInBasket(){
       int basketItemCount = waitAndFindElements(PRODUCTNAME).size();

       return basketItemCount==2;
    }

    public boolean isBasketPageEmpty(){
        return isExist(EMPTYPAGETEXT,10);
    }

    public BasketPage clickDeleteIcon(){
        waitAndFindElement(DELETEONBASKETICON).click();
        return this;
    }
}