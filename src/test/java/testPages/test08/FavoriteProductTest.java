package testPages.test08;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.Driver;

public class FavoriteProductTest extends AddProductFavoritePage{

    // 10.    Yetkili bir kullanici olarak bir ürünü favoriler listesine alabilmeliyim

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = Driver.getDriver();
    }

    @Test
    public void testFavoriteProduct() {
        login();
        addProductToFavourite();
        addProductToFavourite();
        viewWishList();
        wishListControl();
    }


    @AfterTest
    public void afterTest() {
        Driver.quitDriver();
    }
}

