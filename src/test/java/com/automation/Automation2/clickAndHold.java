package com.automation.Automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class clickAndHold extends BaseClass {
	@Test
	public  void clickAndHold() throws InterruptedException {
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.linkText("Click & Hold")).click();
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("circle"))).perform();
		Thread.sleep(3000)	;
	}

}
