package Seventeenth_Oct;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

//import junit.framework.Assert;

public class HRM_LoginLoc {
	
	@SuppressWarnings("deprecation")
	@Test
	public void HRMLocators() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver_106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(5000);
		
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList", actualURL);
		String actualValue = driver.findElement(By.tagName("h6")).getText();
		Assert.assertEquals("PIM", actualValue);
		System.out.println("validated");
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(4000);
		boolean isButtonPresent = driver.findElement(By.tagName("button")).isDisplayed();
		Assert.assertEquals(true, isButtonPresent);
		Thread.sleep(1000);
		driver.close();
		
		
	}
}
