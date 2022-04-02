package testPages.test02;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testPages.test01.LoginHomePage;
import utils.Driver;


public class TestClassUnAuthorized {
    WebDriver driver;

    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();
    LoginHomePage loginHomePage = new LoginHomePage();

    @BeforeSuite
    public void beforeTest() {
        driver = Driver.getDriver();
    }

    @Test
    public void unAuthorizedPSTest() {
        loginHomePage.openPage();
        additionHomePage.searchText("ipod");
        additionHomePage.randomProductSelection();
       // additionHomePage.isProductInCart("1");
    }

    @AfterSuite
    public void afterTest() {
        Driver.quitDriver();
    }

}
