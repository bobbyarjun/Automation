package com.automation.Automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class slideBar extends BaseClass {

	@Test
	public  void slideBar() throws InterruptedException {
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[.='Slider']")).click();
		Thread.sleep(2000);
		int width = driver.findElement(By.xpath("//input[@type=\"range\"]")).getRect().getWidth();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[@type=\"range\"]")),width/2, 0).click().perform();
	}

}
