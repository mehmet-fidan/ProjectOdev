package testPages.test02;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testPages.test01.LoginHomePage;
import utils.Driver;


public class UnAuthorizedTest02 extends ProductAdditionHomePage {

    WebDriver driver;


    @BeforeSuite
    public void beforeTest() {
        driver = Driver.getDriver();
    }

    @Test
    public void unAuthorizedPSTest() {
        gotoUrl();
        searchText("ipod");
        randomProductSelection();
        // isProductInCart("1");
    }

    @AfterSuite
    public void afterTest() {
        Driver.quitDriver();
    }

}
