package co.sq72.fwk.web.pages;

import co.sq72.fwk.web.helper.Helper;
import org.openqa.selenium.By;

public class ShopIt extends Helper {

    public ShopIt ItemSpecifics(){
        driver.findElement(By.cssSelector(".QuantitySelector__Button:nth-child(3)")).click();
        return this;
    }
}
