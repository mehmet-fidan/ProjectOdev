package testPages.test03;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testPages.test01.LoginHomePage;
import testPages.test02.ProductAdditionHomePage;
import utils.Driver;

public class ClassIpodNanoAuthorizedTest02 {
    WebDriver driver;
    LoginHomePage loginHomePage = new LoginHomePage();
    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();
    productAddRemovePage productAddRemovePage = new productAddRemovePage();

    @BeforeSuite
    public void beforeTest() {
        driver = Driver.getDriver();
    }


    @Test
    public void authorizedIpodNanoAddTest2() {
        loginHomePage.openPage();
        loginHomePage.loginPage();
        loginHomePage.login("ZeydinToprak@hotmail.com", "123456");
        additionHomePage.searchText("ipod");
        productAddRemovePage.addFiveIpodNanoToCart(4);
        loginHomePage.logoutPage();
    }


    @AfterSuite
    public void afterTest(){
       Driver.quitDriver();
    }

}
