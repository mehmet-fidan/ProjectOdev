package testPages.test01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.Driver;
import utils.ParentClass;

public class TestClass01 extends ParentClass {

    LoginHomePage loginHomePage = new LoginHomePage();


    @Test(priority = -1)
    public void testLoginPage() {
        gotoUrl();
        loginHomePage.loginPage();
    }

    @Test(dataProvider = "getData")
    public void testLogin(String email, String password, int status) {
        loginHomePage.login(email,password,status);
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = {
                {"eneal8@drupal.org", "bwwy0aBJIJ", 0},
                {"bdorkena@github.com", "8AjXlD6", 0},
                {"ZeydinToprak@hotmail.com", "123456", 1},
                {"hbendb@imdb.com", "mCdonxCK2Ix", 0},
        };
        return  data;
    }


    @AfterTest
    public void afterTest() {
        Driver.quitDriver();
    }
}
