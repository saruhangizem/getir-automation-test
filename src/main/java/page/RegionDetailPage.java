package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.RegionDetailPageConstants;

public class RegionDetailPage extends RegionDetailPageConstants {

    public RegionDetailPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ContactInformationPage clickBackButton(){
        waitAndFindElements(IMAGE_VIEW_CLASS).get(0).click();
        return new ContactInformationPage(driver);
    }

    public ContactInformationPage chooseRegion(){
        waitAndFindElements(IMAGE_VIEW_CLASS).get(1).click();
        return new ContactInformationPage(driver);
    }

    public RegionDetailPage searchTextWithReturnResult(){
        waitAndFindElements(EDIT_TEXT_CLASS).get(0).sendKeys(searchTextWithReturnResult);
        return this;
    }

    public boolean isRegionReturned(){
        return waitAndFindElements(TEXT_VIEW_CLASS).get(1).getText().equals("Region1");
    }

    public RegionDetailPage searchTextWithNoResult(){
        waitAndFindElements(EDIT_TEXT_CLASS).get(0).sendKeys(searchTextWithNoResult);
        return this;
    }

    public boolean isRegionNoResult(){
        return waitAndFindElements(TEXT_VIEW_CLASS).get(0).getText().equals("Select Your Region");
    }

}