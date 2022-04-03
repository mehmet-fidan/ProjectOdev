package testPages.test04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;


public class ProductNAndPHomePage extends ParentClass {


    By lAddMacsToCart = By.xpath("//button[contains(@onclick, 'cart.add')]");
    By lViewCartButton = By.cssSelector("div button #cart-total");
    By lViewCartInner = By.xpath("(//a//i[@class='fa fa-shopping-cart'])[1]");
    By lProductsName = By.xpath("//div//h4//a");
    By lProductsPrice = By.xpath("//div//p[@class='price']");
    By lProductsNameInCart = By.xpath("//div[@class='table-responsive']//table//tbody//tr//td[@class='text-left']//a");
    By lProductsPriceInCart = By.xpath("//div[@class='table-responsive']//table//tbody//tr//td[@class='text-right']");
    By lTotalPrice = By.xpath("(//div[@class='col-sm-4 col-sm-offset-8']//table//tbody//tr//td[@class='text-right'])[4]");


    public void addMultipleProductsToCart() {
        List<WebElement> products = driver.findElements(lAddMacsToCart);
        for (WebElement product : products) {
            product.click();
        }
    }

    public void getProductsNameAndPrice() {

        List<WebElement> productsName = driver.findElements(lProductsName);
        List<WebElement> productsPrice = driver.findElements(lProductsPrice);

        String[] priceOfProducts;

        for (int i = 0; i < productsName.size(); i++) {
            for (int j = i; j <= i; j++) {
                priceOfProducts = productsPrice.get(j).getText().split("\n");
                System.out.println(productsName.get(i).getText() + "= " + priceOfProducts[0]);
            }
        }
        System.out.println("**********");
    }

    public void getProductsNameAndPriceInCart() {
        sleep(2000);
        clickTo(lViewCartButton);
        clickTo(lViewCartInner);
        List<WebElement> productsNameInCart = driver.findElements(lProductsNameInCart);
        List<WebElement> productsPriceInCart = driver.findElements(lProductsPriceInCart);


         double eachProductsPrice;
         double totalPrice=0 ;
        for (int i = 0; i < productsNameInCart.size(); i++) {

            for (int j = 0; j < productsPriceInCart.size(); j++) {

                if ( i+i+1 == j) {
                        System.out.println(productsNameInCart.get(i).getText() +
                                "= " + productsPriceInCart.get(j).getText());
                        eachProductsPrice=Double.parseDouble(productsPriceInCart.get(j).getText().
                                replaceAll("[^0-9]",""));
                        totalPrice+=eachProductsPrice;
                }
            }
        }
        Assert.assertEquals(Double.parseDouble(driver.findElement(lTotalPrice).getText().
                replaceAll("[^0-9]","")), totalPrice);
        System.out.println(totalPrice);
        System.out.println(Double.parseDouble(driver.findElement(lTotalPrice).getText().
                replaceAll("[^0-9]","")));
    }
}