package com.automation.Automation2;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class printPopup extends BaseClass{
	@Test

	public  void printpopup() throws AWTException, InterruptedException {
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Others']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Print']")).click();
		driver.findElement(By.xpath("//li[text()='3']")).click();
		driver.findElement(By.xpath("//button[text()='Print this out!']")).click();
		Thread.sleep(4000);
		Robot r =new Robot();
		r.keyPress(java.awt.event.KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(java.awt.event.KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(java.awt.event.KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(java.awt.event.KeyEvent.VK_DOWN);
		r.delay(1000);
		r.keyPress(java.awt.event.KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(java.awt.event.KeyEvent.VK_DOWN);
		r.delay(1000);
		r.keyPress(java.awt.event.KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(java.awt.event.KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(java.awt.event.KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	}

}
