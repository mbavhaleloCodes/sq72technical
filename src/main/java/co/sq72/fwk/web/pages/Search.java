package co.sq72.fwk.web.pages;

import co.sq72.fwk.web.helper.Helper;
import org.openqa.selenium.By;

public class Search extends Helper {
    private By searchField = By.name("q");

    public Search searchProducts(String product){
        driver.switchTo().activeElement();
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys(product);
        return this;
    }

    public Search selectFromResults(){
        //NB Change this to dynamically select specific item "Men’s SpaceX Polo" by description
        driver.findElement(By.cssSelector(".Grid__Cell:nth-child(1) .ProductItem__Info a")).click();
        return this;
    }
}
