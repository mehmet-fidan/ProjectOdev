package testPages.test01;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.ParentClass;

public class LoginHomePage extends ParentClass {

    /*
    1.    Yetkili bir kullanici olarak gecerli bir kullanici ve sifre ile login ve logout yapabilmeliyim
    (Örnek: Bu gibi durumlarda yetkisiz girisler denemeleri de kontrol edilmeli)
     */

    String url = "http://opencart.abstracta.us/";
    By lMyAccount = By.cssSelector("a[title='My Account']");
    By lLogin = By.xpath("//a[text()='Login']");
    By lLogout = By.xpath("(//div//a[text()='Logout'])[2]");
    By lLogout2 = By.xpath("(//div//a[text()='Logout'])[1]");


    By lEmail = By.id("input-email");
    By lPassword = By.id("input-password");
    By lLoginButton = By.cssSelector("input[value='Login']");
    By lWarning = By.xpath("//div[contains(text(), 'Warning')]");
    By lLogOutText = By.xpath("(//a[text()='Logout'])[2]");


    public void loginPage() {
        clickTo(lMyAccount);
        clickTo(lLogin);
    }

    public void logoutPage(){
        clickTo(lMyAccount);
        clickTo(lLogout2);

    }

    public void login(){
        sendKeysTo(lEmail, "ZeydinToprak@hotmail.com");
        sendKeysTo(lPassword, "123456");
        clickTo(lLoginButton);
    }
    public void logout ( ){
        clickTo(lLogout);
    }


    public void login(String email, String password, int status) {
        sendKeysTo(lEmail, email);
        sendKeysTo(lPassword, password);
        clickTo(lLoginButton);

        if (status == 0) {
            Assert.assertTrue(driver.findElement(lWarning).getText().contains("Warning"));
            clear(lEmail);
            clear(lPassword);
        } else {
            Assert.assertTrue(driver.findElement(lLogOutText).getText().contains("Logout"));
           clickTo(lLogOutText);
            clickTo(lMyAccount);
            clickTo(lLogin);
        }

    }

}
