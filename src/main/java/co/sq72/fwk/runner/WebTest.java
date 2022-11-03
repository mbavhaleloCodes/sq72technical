package co.sq72.fwk.runner;

import co.sq72.fwk.web.helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebTest {
    public WebDriver driver;

    @BeforeMethod
    public void prepBrowser(){
        setChromeDriverProperty();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        this.driver = new ChromeDriver(options);
        Helper.setHelper(this.driver);
    }


    private static void setChromeDriverProperty() {
        if(System.getProperty("os.name").startsWith("Windows")){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/win/chromedriver.exe");
        }else {
            System.out.println(System.getProperty("os.name"));
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/linux/chromedriver");
        }

    }


    @AfterMethod
    public void endAndDestroy(){
        this.driver.quit();
    }
}
