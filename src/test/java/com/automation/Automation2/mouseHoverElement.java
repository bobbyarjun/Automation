package com.automation.Automation2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseHoverElement extends BaseClass{

	public  void mouseHoverElement() {
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		driver.findElement(By.linkText("Icon")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("img[class='w-5 h-5 mt-5 ml-3 cursor-pointer ']"))).perform();
		List<WebElement> suggestios = driver.findElements(By.xpath("//ul[@class=\"p-4\"]/li"));
		for(WebElement suggeston :suggestios) {
			System.out.println(suggeston.getText());
		}

	}

}
