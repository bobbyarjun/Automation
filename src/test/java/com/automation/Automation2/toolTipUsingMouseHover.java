package com.automation.Automation2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class toolTipUsingMouseHover extends BaseClass{

	@Test
	public void toolTipUsingMouseHover() {
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		driver.findElement(By.linkText("Image")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@title]")));
        String title = driver.findElement(By.xpath("//img[@title]")).getAttribute("title");
	    System.out.println(title);
	    
	}

}
