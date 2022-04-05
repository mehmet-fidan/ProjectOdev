package testPages.test11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testPages.test01.LoginHomePage;
import utils.ParentClass;

import java.util.Map;

public class AddressInfoAdditionPage extends ParentClass {

    By lAddressBook = By.xpath("//ul//a[text()='Address Book']");
    By lNewAddress =  By.xpath("//a[text()='New Address']");
    By lFirstName = By.id("input-firstname");
    By lLastName = By.id("input-lastname");
    By lAddress1 = By.id("input-address-1");
    By lCity = By.id("input-city");
    By lPostCode =By.id("input-postcode");
    By lCountry = By.id("input-country");
    By lZone = By.id("input-zone");
    By lYes = By.cssSelector("input[type='radio'][value='1']");
    By lContinue = By.cssSelector("input[type='submit'][value='Continue']");

    LoginHomePage loginHomePage = new LoginHomePage();

    public void login() {
        gotoUrl();
        loginHomePage.loginPage();
        loginHomePage.login();
    }

    public void myAddressDetails (Map<String, String> addressBook){
        clickTo(lAddressBook);
        clickTo(lNewAddress);
        sendKeysTo(lFirstName,addressBook.get("First Name"));
        sendKeysTo(lLastName,addressBook.get("Last Name"));
        sendKeysTo(lAddress1,addressBook.get("Address 1"));
        sendKeysTo(lCity,addressBook.get("City"));
        sendKeysTo(lPostCode,"2323");

        WebElement countryElement = driver.findElement(lCountry);
        Select country= new Select(countryElement);
        country.selectByVisibleText(addressBook.get("Country"));

        WebElement zoneElement = driver.findElement(lZone);
        Select region= new Select(zoneElement);
        sleep(1000);
        region.selectByVisibleText(addressBook.get("Region / State"));

        if (addressBook.get("Default Address").equals("1")) {
            clickTo(lYes);
        }

        clickTo(lContinue);

    }

}
