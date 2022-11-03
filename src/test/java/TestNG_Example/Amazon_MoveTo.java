package TestNG_Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Eighteenth_Oct.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class Amazon_MoveTo {
	
	WebDriver driver;
    ReadConfig conf;

    @BeforeTest
    public void launchApp() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");

    }

    @AfterTest
    public void closingApp() throws Exception {

        Thread.sleep(5000);
        driver.close();
        System.out.println("closing app....");

    }

    @Test
    public void verifyDeleteFeature() throws Exception {
        
        WebDriverWait wait = new WebDriverWait(driver, 60);                                         //maximum time
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'sign in')]")));
        
        
        
        WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
        //rightButton.click();
        
        //create an object of action class
        Actions act = new Actions(driver);
        act.moveToElement(signIn).perform();
        
        
//      act.moveToElement(signIn).moveToElement(signIn).click().perform();
//      act.moveToElement(signIn).click(signIn).perform();
        
        WebElement wishEl = driver.findElement(By.xpath("//span[contains(text(), 'Wish List')]"));
        
        //act.moveToElement(signIn).moveToElement(wishEl).click().perform();
        act.moveToElement(wishEl).click(wishEl).perform();
        
        //validate application title
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Wish List", actualTitle);
        
        
    }
    
    
    
    
    

}
