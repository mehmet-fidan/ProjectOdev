package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentClass {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public ParentClass(){
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void gotoUrl(String url){
        driver.get(url);
    }

    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void clickTo(WebElement element){
        element.click();

    }

    public void sendKeysTo(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void senKeysTo(WebElement element, String text){
        element.sendKeys(text);

    }
    public void login(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void clear(By locator){
       driver.findElement(locator).clear();
    }

    public void sleep(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
