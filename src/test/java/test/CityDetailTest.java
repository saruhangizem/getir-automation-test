package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.ContactInformationPage;

public class CityDetailTest extends BaseTest {

    @Test
    public void selectCity(){
        ContactInformationPage contactInformationPage = new ContactInformationPage(driver);

        boolean isCitySelected = contactInformationPage
                .clickCitySelector()
                .chooseCity()
                .isCitySelected();

        Assert.assertTrue("City1 şehri seçilemedi.", isCitySelected);
    }

    @Test
    public void searchTextWithReturnResult(){
        ContactInformationPage contactInformationPage = new ContactInformationPage(driver);

        boolean isCityReturned = contactInformationPage
                .clickCitySelector()
                .searchTextWithReturnResult()
                .isCityReturned();

        Assert.assertTrue("Search sonucunda ilgili sonuç dönmedi.", isCityReturned);
    }

    @Test
    public void searchTextWithNoResult(){
        ContactInformationPage contactInformationPage = new ContactInformationPage(driver);

        boolean isCityNoResult = contactInformationPage
                .clickCitySelector()
                .searchTextWithNoResult()
                .isCityNoResult();

        Assert.assertTrue("Search sonucunda dönmemesi gereken sonuç döndü", isCityNoResult);
    }

    @Test
    public void isBackButtonReturnContactInformationPage(){
        ContactInformationPage contactInformationPage = new ContactInformationPage(driver);

        boolean isContactInformationPage = contactInformationPage
                .clickCitySelector()
                .clickBackButton()
                .isContactInformationPage();

        Assert.assertTrue("Back butonu contact info sayfasına dönmedi.", isContactInformationPage);
    }

}