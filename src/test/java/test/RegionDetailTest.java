package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.ContactInformationPage;

public class RegionDetailTest extends BaseTest {

    @Test
    public void selectRegion(){
        ContactInformationPage contactInformationPage = new ContactInformationPage(driver);

        boolean isRegionSelected = contactInformationPage
                .clickRegionSelector()
                .chooseRegion()
                .isRegionSelected();

        Assert.assertTrue("Region1 seçilemedi.", isRegionSelected);
    }

    @Test
    public void searchTextWithReturnResult(){
        ContactInformationPage contactInformationPage = new ContactInformationPage(driver);

        boolean isRegionReturned = contactInformationPage
                .clickRegionSelector()
                .searchTextWithReturnResult()
                .isRegionReturned();

        Assert.assertTrue("Search sonucunda ilgili sonuç dönmedi.", isRegionReturned);
    }

    @Test
    public void searchTextWithNoResult(){
        ContactInformationPage contactInformationPage = new ContactInformationPage(driver);

        boolean isRegionNoResult = contactInformationPage
                .clickRegionSelector()
                .searchTextWithNoResult()
                .isRegionNoResult();

        Assert.assertTrue("Search sonucunda dönmemesi gereken sonuç döndü", isRegionNoResult);
    }

    @Test
    public void isBackButtonReturnContactInformationPage(){
        ContactInformationPage contactInformationPage = new ContactInformationPage(driver);

        boolean isContactInformationPage = contactInformationPage
                .clickRegionSelector()
                .clickBackButton()
                .isContactInformationPage();

        Assert.assertTrue("Back butonu contact info sayfasına dönmedi.", isContactInformationPage);
    }

}