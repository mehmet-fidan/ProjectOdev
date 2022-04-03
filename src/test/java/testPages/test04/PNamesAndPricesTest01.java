package testPages.test04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import testPages.test01.LoginHomePage;
import testPages.test02.ProductAdditionHomePage;
import utils.Driver;

public class PNamesAndPricesTest01 extends ProductNAndPHomePage {

   // 6.    Yetkili/Yetkisiz bir kullanici olarak sepete ekledigim birden fazla ürünün isim
    // ve fiyatlari ile toplma fiyat tutarli olmali

    WebDriver driver;

    LoginHomePage loginHomePage = new LoginHomePage();
    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();


    @BeforeSuite
    public void beforeSuite() {
        driver = Driver.getDriver();
    }

    @Test
    public void testProductNAndPAddedCart() {
        gotoUrl();
        loginHomePage.loginPage();
        loginHomePage.login("ZeydinToprak@Hotmail.com", "123456");
        additionHomePage.searchText("mac" + Keys.ENTER);
        addMultipleProductsToCart();
        getProductsNameAndPrice();
    }

    @Test
    public void testProductsNAndPInCart(){
        getProductsNameAndPriceInCart();
    }



    @AfterSuite
    public void afterSuite() {
        Driver.quitDriver();
    }
}
