package com.automation.Automation2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class mouseHover extends BaseClass {
@Test
	public void mousehover() throws InterruptedException {
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.linkText("Mouse Hover")).click();
		driver.findElement(By.linkText("Tab")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[text()='Home & Living']"))).perform();
		List<WebElement> hoveritems = driver.findElements(By.xpath("//li[@class=\"HomeAndLiving relative\"]//li"));
		for(WebElement item:hoveritems) {
			action.moveToElement(item).perform();
		}
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//li[text()='Kids ']"))).perform();
		List<WebElement> hoveritemss = driver.findElements(By.xpath("//li[text()='Kids ']//li"));
		for(WebElement item:hoveritemss) {
			action.moveToElement(item).perform();
		}
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//li[text()='Women ']"))).perform();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//li[text()='Men ']"))).perform();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//li[text()='Beauty ']"))).perform();
	}

}
