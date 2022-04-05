package testPages.test07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testPages.test02.ProductAdditionHomePage;
import utils.ParentClass;

import java.util.List;

public class ProductSelectionPage extends ParentClass {

    By lListCriteria = By.id("input-sort");

    ProductAdditionHomePage additionHomePage = new ProductAdditionHomePage();


    public void findProduct(){
        gotoUrl();
        additionHomePage.searchText("mac");

    }

    public  void listProductByPrice (){
        WebElement  listCriteria =driver.findElement(lListCriteria);
        Select select = new Select(listCriteria);
        List<WebElement> options = select.getOptions();
        options.get(4).click();
    }

}
