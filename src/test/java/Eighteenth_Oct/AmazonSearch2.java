package Eighteenth_Oct;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch2 {
	
	WebDriver driver;
	
	@Test
	public void SearchiPhone() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Student\\\\Downloads\\\\chromedriver_106\\\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		ReadConfig conf = new ReadConfig();
		
		String browser = conf.getBrowser();
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		String LaunchURL = conf.getURL();
		
		driver.get(LaunchURL);
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		String part = "iphone 14";
		Assert.assertTrue(actualTitle.contains(part));
		Assert.assertEquals("Amazon.in : iphone 14", actualTitle);
		Assert.assertEquals("Amazon.in : "+part, actualTitle);
		
		driver.close();

}
}
