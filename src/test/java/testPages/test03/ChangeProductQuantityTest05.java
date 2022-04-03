package testPages.test03;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testPages.test01.LoginHomePage;
import testPages.test02.ProductAdditionHomePage;
import utils.Driver;

public class ChangeProductQuantityTest05 extends ProductAddRemovePage{

    WebDriver driver;

    LoginHomePage loginHomePage = new LoginHomePage();
    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();

    @BeforeSuite
    public void beforeSuite() {
        driver = Driver.getDriver();
    }


    @Test
    public void changeQuantityOfProductTest5() {
        gotoUrl();
        loginHomePage.loginPage();
        loginHomePage.login("ZeydinToprak@hotmail.com", "123456");
        additionHomePage.searchText("ipod");
        additionHomePage.randomProductSelection();
        changeQuantityInCart(1);
    }


    @AfterSuite
    public void afterSuite(){
       Driver.quitDriver();
    }

}
