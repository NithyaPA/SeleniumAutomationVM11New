package Twentieth_Oct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	@Before
	public void LaunchApp() throws Exception {
		
		System.out.println("Launching the Appln");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@After
	public void ClosingApp() throws Exception {
		System.out.println("Closing the Appln");
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test
	public void Appln() {
		System.out.println("Executing..");
	}
}
