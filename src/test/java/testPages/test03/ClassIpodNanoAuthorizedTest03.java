package testPages.test03;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testPages.test01.LoginHomePage;
import testPages.test02.ProductAdditionHomePage;
import utils.Driver;

public class ClassIpodNanoAuthorizedTest03 {
    WebDriver driver;
    LoginHomePage loginHomePage = new LoginHomePage();
    productAddRemovePage productAddRemovePage = new productAddRemovePage();
    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();

    @BeforeSuite
    public void beforeTest() {
        driver = Driver.getDriver();
    }


    @Test
    public void removeListFromCartTest3() {
        loginHomePage.openPage();
        loginHomePage.loginPage();
        loginHomePage.login("ZeydinToprak@hotmail.com", "123456");
        additionHomePage.searchText("ipod");
        additionHomePage.randomProductSelection();
        productAddRemovePage.removeListFromCart();
        loginHomePage.logoutPage();
    }


    @AfterSuite
    public void afterTest() {
        Driver.quitDriver();
    }

}
