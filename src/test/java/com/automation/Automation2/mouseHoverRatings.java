package com.automation.Automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseHoverRatings extends BaseClass{

	public  void mousehoverratings() {
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		driver.findElement(By.linkText("Ratings")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='flex justify-center pt-2']/label[3]"))).click().perform();	
	}

}
