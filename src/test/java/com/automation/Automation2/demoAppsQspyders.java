package com.automation.Automation2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;

public class demoAppsQspyders extends BaseClass{

	@Test
	public  void demoAppsQspyders() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(52));
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.linkText("Drag & Drop")).click();
		driver.findElement(By.linkText("Drag Position")).click();
		WebElement sourcce = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement target = driver.findElement(By.xpath("//div[.='Mobile Accessories']"));
		Actions action=new Actions(driver);
		Thread.sleep(1000);
		action.dragAndDrop(sourcce, target);
	}
}
