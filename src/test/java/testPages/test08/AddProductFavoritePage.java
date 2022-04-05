package testPages.test08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import testPages.test01.LoginHomePage;
import testPages.test02.ProductAdditionHomePage;
import utils.ParentClass;

import java.util.List;

public class AddProductFavoritePage extends ParentClass {

    By  lWishList = By.xpath("//div//div[@class='product-thumb']//button[contains(@data-original-title,  'Wish')]");
    By lWishListViewButton = By.id("wishlist-total");
    By lWishListCheck = By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr/td[contains(text(),'roduct')]");

    LoginHomePage loginHomePage = new LoginHomePage();
    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();

    public void login(){
        gotoUrl();
        loginHomePage.loginPage();
        loginHomePage.login();
    }

    public void addProductToFavourite() {
        additionHomePage.searchText("ipod");
        List<WebElement> wishList = driver.findElements(lWishList);
        for (WebElement list : wishList) {
            list.click();
        }
    }

    public void viewWishList(){
        clickTo(lWishListViewButton);
    }

    public void wishListControl(){
        List<WebElement> wishListCart = driver.findElements(lWishListCheck);
        int productQuantity = 4;
        Assert.assertEquals( wishListCart.size(),productQuantity);

    }
}
