package testPages.test03;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testPages.test01.LoginHomePage;
import testPages.test02.ProductAdditionHomePage;
import utils.Driver;

public class ClassIpodNanoAuthorizedTest03 extends ProductAddRemovePage {

    WebDriver driver;

    LoginHomePage loginHomePage = new LoginHomePage();
    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();

    @BeforeSuite
    public void beforeSuite() {
        driver = Driver.getDriver();
    }


    @Test
    public void removeListFromCartTest3() {
        gotoUrl();
        loginHomePage.loginPage();
        loginHomePage.login();
        additionHomePage.searchText("ipod");
        additionHomePage.randomProductSelection();
        removeListFromCart();
        loginHomePage.logoutPage();
    }


    @AfterSuite
    public void afterSuite() {
        Driver.quitDriver();
    }

}
