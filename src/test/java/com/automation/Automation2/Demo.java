package com.automation.Automation2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Demo extends BaseClass{
	static int count;
	static String secondwh;
	static String thirdwh;
	@Test
	public  void Demo() throws Exception{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> windows = driver.getWindowHandles();
		String secondwindow="";
		String thirddwindow="";
		for(String window:windows) {
			Thread.sleep(3000);
                  driver.switchTo().window(window);
                  driver.manage().window().maximize();
                  if(driver.getTitle().contains("Google")) {
                         System.out.println(driver.findElement(By.xpath("//button[@jsname=\"Cuz2Ue\"]")).getText());
                          secondwindow = window;
                  }
                  else if(driver.getTitle().contains("Apple")) {
                	  Thread.sleep(3000);
                	  System.out.println(driver.findElement(By.partialLinkText("Forgot")).getText());
                  thirddwindow=window;
		}
		}
		driver.switchTo().window(secondwindow);
		driver.close();
		driver.switchTo().window(thirddwindow);
	}
}
