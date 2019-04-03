package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.CityDetailPageConstants;

public class CityDetailPage extends CityDetailPageConstants {

    public CityDetailPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ContactInformationPage clickBackButton(){
        waitAndFindElements(IMAGE_VIEW_CLASS).get(0).click();
        return new ContactInformationPage(driver);
    }

    public ContactInformationPage chooseCity(){
        waitAndFindElements(IMAGE_VIEW_CLASS).get(1).click();
        return new ContactInformationPage(driver);
    }

    public CityDetailPage searchTextWithReturnResult(){
        waitAndFindElements(EDIT_TEXT_CLASS).get(0).sendKeys(searchTextWithReturnResult);
        return this;
    }

    public boolean isCityReturned(){
        return waitAndFindElements(TEXT_VIEW_CLASS).get(1).getText().equals("City1");
    }

    public CityDetailPage searchTextWithNoResult(){
        waitAndFindElements(EDIT_TEXT_CLASS).get(0).sendKeys(searchTextWithNoResult);
        return this;
    }

    public boolean isCityNoResult(){
        return waitAndFindElements(TEXT_VIEW_CLASS).get(0).getText().equals("Select your city");
    }

}