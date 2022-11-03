package Twentieth_Oct;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Example2 extends BaseTest{
	
	@Test
	public void SingleValDropdown() throws Exception {
		
		WebElement list = driver.findElement(By.tagName("select"));
		Select sel = new Select(list);
		
		Thread.sleep(3000);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByValue("Russia");
		Thread.sleep(3000);
		sel.selectByVisibleText("Toyota");
		
		System.out.println("Is multiple elements present: " + sel.isMultiple());
		Assert.assertFalse(sel.isMultiple());
		
		
		
	}
}
