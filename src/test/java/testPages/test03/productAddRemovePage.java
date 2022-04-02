package testPages.test03;

import io.netty.handler.codec.compression.FastLzFrameEncoder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ParentClass;

import java.util.List;

public class productAddRemovePage extends ParentClass {

    By lIpodNanoAddToCart = By.xpath("(//div//button//span[text()='Add to Cart'])[2]");

    By lViewCartButton = By.id("cart-total");

    By lViewCartInner = By.xpath("(//a//i[@class='fa fa-shopping-cart'])[1]");

    By lIpodNanoInCartView = By.xpath("//tbody//td//a[text()='iPod Nano']");

    By lFiveIpodNanoToCart = By.xpath("//div[@class='caption']//a[contains(text(), 'iPod Nano')]");
    By lQuantityOfProductText = By.id("input-quantity");
    By lListToRemove = By.xpath("//ul[@class='dropdown-menu pull-right']/li/table/tbody/tr/td/button");

    By lViewProductInCart = By.xpath("//tr//td//a[contains(text(), 'iPod')]");

    By lIpodNanoAddToCart2 = By.id("button-cart");
    By lChangeQuantityInCartButton = By.id("button-cart");


    public void addIpodNanoToCart() {
        clickTo(lIpodNanoAddToCart);
        sleep(3000);
        clickTo(lViewCartButton);
        sleep(3000);
        clickTo(lIpodNanoInCartView);
    }

    public void addFiveIpodNanoToCart(int quantity) {
        clickTo(lFiveIpodNanoToCart);
        clear(lQuantityOfProductText);
        sendKeysTo(lQuantityOfProductText, String.valueOf(quantity));
        clickTo(lIpodNanoAddToCart2);
        sleep(2000);
        clickTo(lViewCartButton);
        clickTo(lIpodNanoInCartView);
    }


    public void removeListFromCart() {

        wait.until(ExpectedConditions.elementToBeClickable(lViewCartButton)).click();
        List<WebElement> lListToRemove2 = driver.findElements(lListToRemove);
        System.out.println(lListToRemove2.size());
        wait.until(ExpectedConditions.elementToBeClickable(lViewCartButton)).click();
        for (WebElement element : lListToRemove2) {
            wait.until(ExpectedConditions.elementToBeClickable(lViewCartButton)).click();
            //  sleep(2000);
            clickTo(lListToRemove);
            //   sleep(1000);
        }

    }

    public void changeQuantityInCart(int quantity) {

        wait.until(ExpectedConditions.elementToBeClickable(lViewCartButton)).click();
        clickTo(lViewProductInCart);
        sleep(1000);
        clear(lQuantityOfProductText);
        sendKeysTo(lQuantityOfProductText, String.valueOf(quantity));
        clickTo(lChangeQuantityInCartButton);

    }
}

