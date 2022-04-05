package testPages.test10;

import org.openqa.selenium.By;
import org.testng.Assert;
import testPages.test01.LoginHomePage;
import utils.ParentClass;

import java.util.Map;

public class EditAccountPage extends ParentClass {

    By lEditAccount = By.xpath("//ul//a[text()='Edit Account']");
    By lFirstName = By.id("input-firstname");
    By lLastName = By.id("input-lastname");
    By lEmail = By.id("input-email");
    By lTelephone = By.id("input-telephone");
    By lContinue = By.cssSelector("input[value='Continue']");
    By lSuccessfullEdit = By.xpath("//div[contains(text(),'successfully')]");

    LoginHomePage loginHomePage = new LoginHomePage();

    public void login() {
        gotoUrl();
        loginHomePage.loginPage();
        loginHomePage.login();
    }

    public void myAccountDetails (Map<String, String> personalInfo){
     String textControl = "successfully";
        clickTo(lEditAccount);
        clear(lFirstName);
        sendKeysTo(lFirstName,personalInfo.get("First Name"));
        clear(lLastName);
        sendKeysTo(lLastName,personalInfo.get("Last Name"));
       // clear(lEmail);
      //  sendKeysTo(lEmail,personalInfo.get("E-Mail"));
        clear(lTelephone);
        sendKeysTo(lTelephone,personalInfo.get("Telephone"));
        clickTo(lContinue);
        Assert.assertTrue(driver.findElement(lSuccessfullEdit).getText().contains(textControl),"not same");

    }



}
