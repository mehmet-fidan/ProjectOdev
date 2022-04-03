package testPages.test03;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testPages.test01.LoginHomePage;
import testPages.test02.ProductAdditionHomePage;
import utils.Driver;

public class ClassIpodNanoAuthorizedTest02 extends ProductAddRemovePage {

    WebDriver driver;

    LoginHomePage loginHomePage = new LoginHomePage();
    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();


    @BeforeSuite
    public void beforeSuite() {
        driver = Driver.getDriver();
    }


    @Test
    public void authorizedIpodNanoAddTest2() {
        gotoUrl();
        loginHomePage.loginPage();
        loginHomePage.login("ZeydinToprak@hotmail.com", "123456");
        additionHomePage.searchText("ipod");
        addFiveIpodNanoToCart(4);
        loginHomePage.logoutPage();
    }


    @AfterSuite
    public void afterSuite() {
        Driver.quitDriver();
    }

}
