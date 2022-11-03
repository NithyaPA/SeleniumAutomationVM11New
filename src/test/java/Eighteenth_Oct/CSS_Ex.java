package Eighteenth_Oct;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Ex {
	
	
	@Test
	public void CSS_Exercise() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		ReadConfig config = new ReadConfig();
		String AppURL = config.getNOPURL();
		
		driver.get(AppURL);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='Email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.cssSelector("input[id='Password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='RememberMe']")).click();
		
		
	}

}
