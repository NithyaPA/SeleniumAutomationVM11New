package Eighteenth_Oct;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Exer_NOP {
	
	@Test
	public void NOP_Exercise() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		ReadConfig conf = new ReadConfig();
		String AppURL = conf.getNOPURL();
		
		driver.get(AppURL);
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		driver.findElement(By.className("password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("password")).sendKeys("admin");
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains("nopCommerce"));
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		String LoginTitle=driver.getTitle();
		Assert.assertTrue(LoginTitle.contains("Login"));
		Assert.assertEquals("Your store. Login", LoginTitle);
		
		
		driver.close();
	}

}
