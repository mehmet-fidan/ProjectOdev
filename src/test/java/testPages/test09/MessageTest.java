package testPages.test09;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.Driver;

public class MessageTest extends MessageToManagerPage{

    //11.    Yetkili/Yetkisiz bir kullanici olarak yetkililere mesaj gönderebilmeliyim


    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = Driver.getDriver();
    }

    @Test
    public void testSendMessage() {
        login();
        sendMessage();
    }


    @AfterTest
    public void afterTest() {
        Driver.quitDriver();
    }
}

