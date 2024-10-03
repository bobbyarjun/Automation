package com.automation.Automation2;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class dragandDropMultiple extends BaseClass {
	@Test

	public static void dragandDropMultiple() throws AWTException, InterruptedException {
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(52));
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.linkText("Drag & Drop")).click();
		driver.findElement(By.linkText("Drag Multiple")).click();
		Robot robot=new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//div[.='Laptop Charger']")).click();
		driver.findElement(By.xpath("//div[.='Laptop Cover']")).click();
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		WebElement source = driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement target = driver.findElement(By.id("dropZone1"));
		Thread.sleep(1000);
		action.dragAndDrop(source,target).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Mobile Cover']")).click();
		driver.findElement(By.xpath("//div[.='Mobile Charger']")).click();
		WebElement sourcce = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement targett = driver.findElement(By.id("dropZone2"));
		Thread.sleep(1000);
		action.dragAndDrop(sourcce,targett).perform();
		Thread.sleep(10000);
	}

}
