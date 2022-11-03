package TestNG_Example;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void LaunchApp() throws Exception {
		
		System.out.println("Launching the Appln");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@AfterTest
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
