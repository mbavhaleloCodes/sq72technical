package co.sq72.fwk.web.pages;

import co.sq72.fwk.web.helper.Helper;
import org.openqa.selenium.By;


public class GoTo extends Helper {

    public GoTo launchSpaceX(String url){
        driver.get(url);
        return this;
    }

    public GoTo Search(){
        driver.findElement(By.cssSelector(".HorizontalList__Item:nth-child(2) > .Link")).click();
        return this;
    }
}
