package com.automation.Automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class HandlingstaleElements  extends BaseClass{

	@Test
	public  void HandlingstaleElements() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[.='Others']")).click();
		driver.findElement(By.linkText("Stale Element")).click();
		driver.findElement(By.linkText("Click here to enter some text")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder=\"enter text\"]")));
		driver.findElement(By.cssSelector("input[placeholder=\"enter text\"]")).sendKeys("arjun");
	}

}
