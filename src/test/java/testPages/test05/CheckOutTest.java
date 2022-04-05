package testPages.test05;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;
import testPages.test02.ProductAdditionHomePage;
import utils.Driver;

public class CheckOutTest extends NonAuthorizedCheckOut {

    //7.    Yetkisiz bir kullanici olarak ürün checkout yapamamaliyim.

    WebDriver driver;

    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();

    @BeforeSuite
    public void beforeSuite() {
        driver = Driver.getDriver();
    }

    @Test
    public void testCheckOut(){
        gotoUrl();
        additionHomePage.searchText("ipod");

    }


    @AfterSuite
    public void afterSuite() {
        Driver.quitDriver();
    }
}
