package Eighteenth_Oct;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_Ex {
	
	@Test
	public void XPathExercise() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		ReadConfig config = new ReadConfig();
		String AppURL = config.getNOPURL();
		
		driver.get(AppURL);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@className='login-button']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		
		driver.close();
		
	}

}
