package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.ContactInformationPageConstants;

public class ContactInformationPage extends ContactInformationPageConstants {

    public ContactInformationPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public CityDetailPage clickCitySelector() {
        waitAndFindElements(TEXT_VIEW_CLASS).get(2).click();
        return new CityDetailPage(driver);
    }

    public boolean isCitySelected(){
       return waitAndFindElements(TEXT_VIEW_CLASS).get(2).getText().equals("City1");
    }

    public boolean isRegionSelected(){
        return waitAndFindElements(TEXT_VIEW_CLASS).get(4).getText().equals("Region1");
    }

    public RegionDetailPage clickRegionSelector(){
        waitAndFindElements(TEXT_VIEW_CLASS).get(4).click();
        return new RegionDetailPage(driver);
    }

    public ContactInformationPage clickAddressAndSendText(){
        waitAndFindElements(EDIT_TEXT_CLASS).get(0).sendKeys(address);
        return this;
    }

    public boolean isContactInformationPage(){
        return waitAndFindElements(TEXT_VIEW_CLASS).get(0).getText().equals("Contact Information");
    }

    public boolean isAddressFull(){
        return waitAndFindElements(EDIT_TEXT_CLASS).get(0).getText().equals(address);
    }

}