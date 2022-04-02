package testPages.test02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;

public class ProductAdditionHomePage extends ParentClass {

    /*
    2.    Yetkili/Yetkisiz bir kullanici olarak sepete belirli bir ürün ekleyebilmeliyim
     */

    @FindBy(css = "input[name='search']")
    public WebElement eSearchText;

    @FindBy(xpath = "//div//button//span[text()='Add to Cart']")
    public List<WebElement> eProducts;

    @FindBy(id = "cart-total")
    public WebElement eViewCartButton;

    @FindBy(xpath = "(//a//i[@class='fa fa-shopping-cart'])[1]")
    public WebElement eViewCartInner;

    @FindBy(xpath = "//td[@class='text-left']//div//input[@value='1']")
    public WebElement eIsProductInCart;

    public ProductAdditionHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void searchText(String text) {
        senKeysTo(eSearchText, text + Keys.ENTER);
    }

    public void randomProductSelection() {

        int randomIndex = random(eProducts.size());
        clickTo(eProducts.get(randomIndex));
        sleep(2000); //sleep olmadığında bazen calisiyor bazen bulamıyor.
        wait.until(ExpectedConditions.elementToBeClickable(eViewCartButton)).click();
        sleep(2000); //sleep olmadığında bazen calisiyor bazen bulamıyor.
        wait.until(ExpectedConditions.elementToBeClickable(eViewCartInner)).click();
    }


    public void isProductInCart (String valueText){
        Assert.assertTrue(eIsProductInCart.getAttribute("value").equalsIgnoreCase(valueText),"it is fine");
    }


    public int random(int size) {
        return (int) (Math.random() * size);
    }

}
