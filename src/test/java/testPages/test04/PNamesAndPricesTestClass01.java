package testPages.test04;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import testPages.test01.LoginHomePage;
import utils.Driver;
import utils.ParentClass;

public class PNamesAndPricesTestClass01 {

    WebDriver driver;

    LoginHomePage loginHomePage = new LoginHomePage();

    @BeforeSuite
    public void beforeSuite(){
        driver= Driver.getDriver();
    }

    @Test
    public void testLogin() {
        loginHomePage.openPage();
        loginHomePage.loginPage();
        loginHomePage.login("ZeydinToprak@Hotmail.com","123456");
    }


    @AfterSuite
    public void afterSuite(){
        Driver.quitDriver();
    }
}
