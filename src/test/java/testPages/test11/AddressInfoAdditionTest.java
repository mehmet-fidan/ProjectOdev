package testPages.test11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.HashMap;
import java.util.Map;

public class AddressInfoAdditionTest extends AddressInfoAdditionPage {

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
    public void testNewAddress() {
        Map<String, String> addNewAddress = new HashMap<>();

        addNewAddress.put("First Name", "Zeydin");
        addNewAddress.put("Last Name", "Toprak");

        addNewAddress.put("Address 1", "Alabama");
        addNewAddress.put("City", "UCla");
        addNewAddress.put("Post Code", "2323");
        addNewAddress.put("Country", "United States");

        addNewAddress.put("Region / State", "Alabama");
        addNewAddress.put("Default Address", "1");

        myAddressDetails(addNewAddress);

    }


    @AfterTest
    public void afterTest() {
        Driver.quitDriver();
    }
}
