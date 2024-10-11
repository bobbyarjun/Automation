package com.automation.Automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PlayOrPauseAudio extends BaseClass{

	public  void PlayOrAudio() {
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Audio']")).click();
		driver.findElement(By.tagName("audio")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.querySelector('audio').play();");
		jse.executeScript("document.querySelector('audio').volume=1;");

	}

}
