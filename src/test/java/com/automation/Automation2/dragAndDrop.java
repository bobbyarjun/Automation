package com.automation.Automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class dragAndDrop extends BaseClass {
	@Test

	public  void dragAndDrop() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(52));
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.linkText("Drag & Drop")).click();
		driver.findElement(By.linkText("Default")).click();
		WebElement source = driver.findElement(By.xpath("//div[.='Drag Me' and @style]"));
		Actions action=new Actions(driver);
		action.clickAndHold(source).perform();
		action.moveToLocation(0,0).perform();
	}

}
