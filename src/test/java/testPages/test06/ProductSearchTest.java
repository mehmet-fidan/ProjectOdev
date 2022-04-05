package testPages.test06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import testPages.test02.ProductAdditionHomePage;
import utils.Driver;
import utils.ParentClass;

public class ProductSearchTest extends ParentClass {

    //Yetkili/Yetkisiz bir kullanici olarak ürün arayabilmeliyim

    WebDriver driver;

    By lSearchText = By.xpath("//div[@id='content']//label[text()='Search Criteria']");
    String textMatch = "Search Criteria";

    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();

    @BeforeSuite
    public void beforeSuite(){
        driver= Driver.getDriver();
    }

  @Test
  public void testUnAuthorizedSearch(){
        gotoUrl();
        additionHomePage.searchText("ipod");
        Assert.assertTrue(driver.findElement(lSearchText).getText().equalsIgnoreCase(textMatch),"assertion is not ok");
  }

    @AfterTest
    public void afterTest(){
        Driver.quitDriver();
    }
}
