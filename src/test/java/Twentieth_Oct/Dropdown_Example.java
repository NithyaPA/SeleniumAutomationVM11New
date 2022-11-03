package Twentieth_Oct;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Example extends BaseTest{
	
	@Test
	public void MultipleValDropDown() throws Exception {
		
		WebElement list = driver.findElement(By.cssSelector("select[name='FromLB']"));
		Select sel = new Select(list);
		
		System.out.println("is the list contains multiple items " + sel.isMultiple());
		Assert.assertTrue(sel.isMultiple());
		
		//select 3 items
		sel.selectByIndex(5);
		sel.selectByValue("USA");
		sel.selectByVisibleText("Italy");
		Thread.sleep(4000);
		
		sel.deselectAll();
		
		sel.selectByIndex(4);
		sel.selectByValue("Italy");
		sel.selectByVisibleText("Spain");
		sel.selectByIndex(9);
		Thread.sleep(4000);
		
		sel.deselectByIndex(7);
		sel.deselectByValue("Greece");
		sel.deselectByVisibleText("India");
		
		WebElement elem = sel.getWrappedElement();
		System.out.println("the wrapped element/ selected element is " + elem.getAttribute("value"));
		System.out.println("All elements in the list are: " + elem.getText());
		
	}
}
