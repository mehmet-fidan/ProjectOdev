package testPages.test09;

import org.openqa.selenium.By;
import testPages.test01.LoginHomePage;
import utils.ParentClass;

public class MessageToManagerPage extends ParentClass {


    By lContactUsButton = By.xpath("//a[contains(text(), 'Contact')]");
    By lTextArea = By.id("input-enquiry");
    By lSubmitButton = By.cssSelector("input[value='Submit']");

    LoginHomePage loginHomePage = new LoginHomePage();

    public void login() {
        gotoUrl();
        loginHomePage.loginPage();
        loginHomePage.login();
    }

    public void sendMessage (){
        clickTo(lContactUsButton);
        sendKeysTo(lTextArea,"I have some issue to talk");
        clickTo(lSubmitButton);
    }
}
