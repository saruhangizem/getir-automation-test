package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.LoginPage;

public class BasketTest extends BaseTest {

    @Test
    public void addToBasket(){
        LoginPage loginPage = new LoginPage(driver);

        boolean areProductsInBasket = loginPage
                .sendUserName()
                .sendPassword()
                .clickLoginButton()
                .clickHomeCareCategory()
                .clickProduct()
                .clickBackButton()
                .clickPersonalCareCategory()
                .clickProduct()
                .clickBasketIcon()
                .areTwoProductsInBasket();

        Assert.assertTrue("Ürünler sepete eklenemedi.", areProductsInBasket);
    }

    @Test
    public void deleteInBasket(){
        LoginPage loginPage = new LoginPage(driver);

        boolean isBasketEmpty = loginPage
                .sendUserName()
                .sendPassword()
                .clickLoginButton()
                .clickHomeCareCategory()
                .clickProduct()
                .clickBackButton()
                .clickPersonalCareCategory()
                .clickProduct()
                .clickBasketIcon()
                .clickDeleteIcon()
                .clickDeleteIcon()
                .isBasketPageEmpty();

        Assert.assertTrue("Ürünler sepetten silinemedi.", isBasketEmpty);
    }
}