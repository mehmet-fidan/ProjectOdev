package testPages.test10;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.HashMap;
import java.util.Map;

public class EditAccountTest extends EditAccountPage {

    // 12.    Yetkili bir kullanici olarak Account bilgilerimi güncelleyebilmeliyim

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = Driver.getDriver();
    }


    @Test(priority = 1)
    public void testLogin() {
        login();
    }

    @Test(priority = 2)
    public void testEditAccount() {
        Map<String, String> editAccountInfo = new HashMap<>();

        editAccountInfo.put("First Name", "Vahit");
        editAccountInfo.put("Last Name", "Cavus");
       // editAccountInfo.put("E-Mail", "zahitcavus@mynet.com");
        editAccountInfo.put("Telephone", "412214");

        myAccountDetails(editAccountInfo);

    }


    @AfterTest
    public void afterTest() {
        Driver.quitDriver();
    }
}

