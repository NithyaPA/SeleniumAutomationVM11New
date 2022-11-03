package Eighteenth_Oct;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	
	@Test
	public void SearchiPhone() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Student\\\\Downloads\\\\chromedriver_106\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
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
