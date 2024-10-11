package com.automation.Automation2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class keyBoardActions extends BaseClass{

	public void keybordActions() throws AWTException, InterruptedException {
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Keyboard']")).click();	
		Robot r=new Robot();
		Actions action=new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		action.moveToElement(driver.findElement(By.id("email"))).click().sendKeys("rarjun96@gmail.com").perform();
		action.moveToElement(driver.findElement(By.id("password"))).click().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_J);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_J);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_9);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_9);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_6);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('confirmPassword').value='ajji@1996'");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
