package com.automation.Automation2;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class handlingFrames extends BaseClass{
	@Test

	public void handlingframes() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		int width = driver.findElement(By.xpath("//p[.='Admin@gmail.com']")).getSize().getWidth();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//p[.='Admin@gmail.com']")),-width/2,0).clickAndHold().moveToElement(driver.findElement(By.xpath("//p[.='Admin@gmail.com']")),width/2,0).perform();
		Robot robot=new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_C);
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"V");
		Actions action1=new Actions(driver);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		action1.moveToElement(driver.findElement(By.xpath("//p[.='Admin@1234']")),-driver.findElement(By.xpath("//p[.='Admin@1234']")).getRect().getWidth()/2,0).clickAndHold().moveToElement(driver.findElement(By.xpath("//p[.='Admin@1234']")),driver.findElement(By.xpath("//p[.='Admin@1234']")).getRect().getWidth()/2,0).perform();
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_C);
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.name("password")).sendKeys(Keys.CONTROL+"V");
		Thread.sleep(3000);
		driver.findElement(By.id("confirm-password")).sendKeys(Keys.CONTROL+"V");
		driver.findElement(By.id("submitButton")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.xpath("//div[@role='status']")).getText());
	}

}
