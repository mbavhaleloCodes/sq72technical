package co.sq72.fwk.web.helper;

import org.openqa.selenium.WebDriver;

//Reusable method for actions and pages are kept here
public class Helper {
    protected static WebDriver driver;

    public Helper() {
    }

    public static void setHelper(WebDriver webTestDriver) {
        driver = webTestDriver;
    }
}
