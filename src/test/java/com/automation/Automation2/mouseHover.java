package com.automation.Automation2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		List<WebElement> hoveritems1 = driver.findElements(By.xpath("//li[text()='Home & Living']//li"));
		for(WebElement item:hoveritems1) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", item);
		}
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//li[text()='Kids ']"))).perform();
		List<WebElement> hoveritems2 = driver.findElements(By.xpath("//li[text()='Kids ']//li"));
		for(WebElement item:hoveritems2) {
			action.moveToElement(item).perform();
		}
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//li[text()='Women ']"))).perform();
		List<WebElement> hoveritems3 = driver.findElements(By.xpath("//li[text()='Women ']//li"));
		for(WebElement item:hoveritems3) {
			action.moveToElement(item).perform();
		}
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//li[text()='Men ']"))).perform();
		List<WebElement> hoveritems4 = driver.findElements(By.xpath("//li[text()='Men ']//li"));
		for(WebElement item:hoveritems4) {
			action.moveToElement(item).perform();
		}
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//li[text()='Beauty ']"))).perform();
		List<WebElement> hoveritems5 = driver.findElements(By.xpath("//li[text()='Beauty ']//li"));
		for(WebElement item:hoveritems5) {
			action.moveToElement(item).perform();
		}
	}

}
