package com.automation.Automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class staleElementException extends BaseClass {

	@Test
	public  void staleElementException() {
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Others']")).click();
		driver.findElement(By.xpath("//section[text()='Stale Element']")).click();
		driver.findElement(By.linkText("Click here to enter some text")).click();
		driver.findElement(By.xpath("//input[@placeholder='enter text']")).sendKeys("text");

	}

}
