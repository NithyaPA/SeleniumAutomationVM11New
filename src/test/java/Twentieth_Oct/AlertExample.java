package Twentieth_Oct;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertExample extends BaseTest{

	@Test
	public void SimpleAlert() throws Exception {
		driver.findElement(By.cssSelector("input[value='Show Me Alert']")).click();
		Thread.sleep(5000);
		Alert SimpleAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("Simple alert message is: " + SimpleAlert.getText());
		Assert.assertTrue(SimpleAlert.getText().contains("This is alert"));
		SimpleAlert.dismiss();
		
	}
	
	@Test
	public void ConfirmAlert() throws Exception {
		driver.findElement(By.xpath("//button[text()='Show Me Confirmation']")).click();
		Thread.sleep(5000);
		Alert ConfirmAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("Alert message is: " + ConfirmAlert.getText());
		Assert.assertTrue(ConfirmAlert.getText().contains("'OK' or 'Cancel'"));
		ConfirmAlert.accept();
		Thread.sleep(4000);
		String message = driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println("The displayed content is: " + message);
		Assert.assertTrue(message.contains("OK!"));
		

	}
	
	@Test
	public void Prompt() {
		
	}
}
