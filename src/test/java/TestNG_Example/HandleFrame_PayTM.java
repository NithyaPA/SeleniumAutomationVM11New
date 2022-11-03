package TestNG_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleFrame_PayTM extends BaseTest{
	
	@Test
	public void VerifyFrame() throws Exception {
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(), 'Sign')]"));
		signIn.click();
		
		Thread.sleep(5000);
		
		
	}

}
