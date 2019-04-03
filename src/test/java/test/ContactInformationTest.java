package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.ContactInformationPage;

public class ContactInformationTest extends BaseTest {

    @Test
    public void selectCity(){
        ContactInformationPage contactInformationPage = new ContactInformationPage(driver);

        boolean isContactInformationFormFull = contactInformationPage
                .clickCitySelector()
                .chooseCity()
                .clickRegionSelector()
                .chooseRegion()
                .clickAddressAndSendText()
                .isAddressFull();

        Assert.assertTrue("Adres girilemedi, form eksik kaldı.", isContactInformationFormFull);
    }

}