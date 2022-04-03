package testPages.test02;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testPages.test01.LoginHomePage;
import utils.Driver;

public class AuthorizedTest01 extends ProductAdditionHomePage {

    WebDriver driver;
    LoginHomePage loginHomePage = new LoginHomePage();


    @BeforeSuite
    public void beforeTest() {
        driver = Driver.getDriver();
    }

    @Test
    public void authorizedPSTest() {
        gotoUrl();
        loginHomePage.loginPage();
        loginHomePage.login("ZeydinToprak@hotmail.com", "123456");
        searchText("ipod");
        randomProductSelection();
        //  isProductInCart("1");
    }

    @AfterSuite
    public void afterTest() {
        Driver.quitDriver();
    }
}
