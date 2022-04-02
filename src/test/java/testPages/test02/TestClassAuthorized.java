package testPages.test02;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testPages.test01.LoginHomePage;
import utils.Driver;

public class TestClassAuthorized {

    WebDriver driver;
    LoginHomePage loginHomePage = new LoginHomePage();
    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();


    @BeforeSuite
    public void beforeTest() {
        driver = Driver.getDriver();
    }

    @Test
    public void authorizedPSTest() {
        loginHomePage.openPage();
        loginHomePage.loginPage();
        loginHomePage.login("ZeydinToprak@hotmail.com", "123456");
        additionHomePage.searchText("ipod");
        additionHomePage.randomProductSelection();
      //  additionHomePage.isProductInCart("1");
    }

    @AfterSuite
    public void afterTest() {
        Driver.quitDriver();
    }
}
