package testPages.test07;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.Driver;

public class ProductSelectionCriteriaTest extends ProductSelectionPage {

    // 9.    Yetkili/Yetkisiz bir kullanici olarak listelenen ürünleri
    // isim/fiyat gibi özelliklerine göre siralayabilmeliyim

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = Driver.getDriver();
    }

    @Test
    public void testListByPrice() {
        findProduct();
        sleep(3000);
        listProductByPrice();
        sleep(3000);
    }


    @AfterTest
    public void afterTest() {
        Driver.quitDriver();
    }
}

