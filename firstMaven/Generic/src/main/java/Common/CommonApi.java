package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by israt on 8/14/2014.
 */
public class CommonApi {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void doomTheDriver(){
        driver.quit();
    }

    //helper methods
    public void typeByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void typeByXpath(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void clickByXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void sleep(int seconds)throws InterruptedException{
        Thread.sleep(1000*seconds);
    }
    public List<WebElement> getWebElements(String locator){
        List<WebElement> elementList = new ArrayList<WebElement>();
        elementList = driver.findElements(By.cssSelector(locator));
        return elementList;
    }
    public void navigateBack(){
        driver.navigate().back();
    }
    public void enterKeys(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }
}


